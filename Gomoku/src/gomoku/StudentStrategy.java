package gomoku;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class StudentStrategy implements ComputerStrategy {

	private final int MAX_DEPTH = 3;
	private int evaluatedCount = 0;
	private int myPlayer = -1;
	private int moveCount = 0;

	public class Move {
		public int row = 0;
		public int col = 0;
		public Move(){};
		public Move(int x, int y)
		{
			row = x;
			col = y;
		}
	}
	
	static final class Stats {
		private SimpleBoard board;
		private int rows;
		private int cols;
		Stats(final SimpleBoard board, int piece) 
		{
			this.board = board;
			rows = board.getHeight();
			cols = board.getWidth();
			
			uncapped2 = inARow(2, 0, piece);
			capped2 = inARow(2, 1, piece);

			uncapped3 = inARow(3, 0, piece);
			capped3 = inARow(3, 1, piece);

			uncapped4 = inARow(4, 0, piece);
			capped4 = inARow(4, 1, piece);
			
			five = inARow(5,2,piece);
		}

		final int capped2;
		final int uncapped2;

		final int capped3;
		final int uncapped3;

		final int capped4;
		final int uncapped4;
		
		final int five;
		
		private int inARowAt(final int row, final int col, //DOES NOT HANDLE WHITESPACE ATM
				final int num, final int maxcaps, final int playerPiece) {

			int count = 0;
			int r;
			int c;

			final int opponentPiece = -playerPiece;


			// Check right.
			if (rows - col >= num) {
				boolean inarow = true;

				for (c = col + 1; c < col + num && inarow; ++c) {
					if (board.getBoard()[row][c] != playerPiece) {
						inarow = false;
					}
				}

				if (inarow) {
					int capCount = 0;

					if (col == 0) {
						capCount++;
					} else {
						if (board.getBoard()[row][col-1]== opponentPiece) {
							capCount++;
						}
					}

					if (col + num == cols) {
						capCount++;
					} else if(board.getBoard()[row][col + num] == opponentPiece) {
							capCount++;
						}
					

					if (capCount <= maxcaps) {
						count++;
					}
				}
			}

			// Check down.
			if (rows - row >= num) {
				boolean inarow = true;

				for (r = row + 1; r < row + num && inarow; ++r) {
					if (board.getBoard()[r][col] != playerPiece) {
						inarow = false;
					}
				}

				if (inarow) {
					int capCount = 0;
					if (row == 0) {
						capCount++;
					} else {
						if (board.getBoard()[row-1][col] == opponentPiece) {
							capCount++;
						}
					}

					if (row + num == rows) {
						capCount++;
					} else if (board.getBoard()[row+num][col] == opponentPiece) {
						capCount++;
					}

					if (capCount <= maxcaps) {
						if(num == 5)
							System.out.println("hi");
						count++;
					}
				}
			}

			// Check down-right
			if (rows - row >= num && cols - col >= num) {
				boolean inarow = true;

				for (r = row + 1, c = (col + 1);
				r < row + num && c < col + num && inarow; r++, c++) {
					if (board.getBoard()[r][c] != playerPiece) {
						inarow = false;
					}
				}

				if (inarow) {
					int capCount = 0;

					// Upper-left bounds.
					if (row == 0 || col == 0) {
						capCount++;
					} else {
						if (board.getBoard()[row-1][col-1] == opponentPiece) {
							capCount++;
						}
					}

					// Lower-right bounds.
					if (row + num == rows || col + num == cols) {
						capCount++;
					} else {
						if (board.getBoard()[row+num][col+num] == opponentPiece) {
							capCount++;
						}
					}

					if (capCount <= maxcaps) {
						count++;
					}
				}
			}

			// Check down-left
			if (rows - row >= num && col >= num - 1) {
				boolean inarow = true;

				for (r = row + 1, c = col - 1;
				r < row + num && c >= 0 && inarow; r++, c--) {
						if (board.getBoard()[r][c] != playerPiece) {
						inarow = false;
					}
				}

				if (inarow) {
					int capCount = 0;

					// Lower-left bounds.
					if (row == rows - 1 || col - num == 0) {
						capCount++;
					} else {
						if (board.getBoard()[row+1][col-1] == opponentPiece) {
							capCount++;
						}
					}

					// Upper-right bounds.
					if (row == 0 || col == cols - 1) {
						capCount++;
					} else {
						if (board.getBoard()[row-1][col+1] == opponentPiece) {
							capCount++;
						}
					}

					if (capCount <= maxcaps) {
						count++;
					}

				}
			}

			return count;
		}

		public int inARow(final int num, final int maxcaps, final int piece) {
			int count = 0;

			for (int row = 0; row < rows; ++row) {
				for (int col = 0; col < cols; ++col) {
					if (board.getBoard()[row][col] == piece && inARowAt(row, col, num, maxcaps,piece) != 0) {
						count++;
					}
				}
			}

			return count;
		}

	}


	
	@Override
	public Location getMove(SimpleBoard board, int player) {
		if (player == SimpleBoard.PLAYER_WHITE && moveCount == 0) {
			moveCount++;
			return new Location(board.getHeight() / 2, board.getWidth() / 2);

		}
		moveCount++;
		// Set initial alpha and beta values
		int alpha = Integer.MIN_VALUE;
		int beta = Integer.MAX_VALUE;
		myPlayer = player;
		evaluatedCount = 0;
		Move mv = new Move();
		move(0, MAX_DEPTH, board, mv, player, alpha, beta);

		return new Location(mv.row, mv.col);

	}

	private static int evaluate(final SimpleBoard board, int player) {
		final Stats c = new Stats(board, player);
		final Stats u = new Stats(board, -player);

		int retVal = 0;

		if (u.uncapped4 > 0) {
			retVal -=10000;
		}


		if (u.five > 0) {
			return Integer.MIN_VALUE+1;
		}
		
		if (c.five > 0) {
			return Integer.MAX_VALUE-1;
		}
		
		if (c.uncapped4 > 0) {
			retVal+= 10000;
		}

		retVal += c.capped2 * 5;
		retVal -= u.capped2 * 5;

		retVal += c.uncapped2 * 10;
		retVal -= u.uncapped2 * 10;

		retVal += c.capped3 * 20;
		retVal -= u.capped3 * 20;

		retVal += c.uncapped3 * 100;
		retVal -= u.uncapped3 * 200;

		retVal += c.capped4 * 500;
		retVal -= u.capped4 * 1000;

		return retVal;
	}

	public static int[][] deepCopyIntMatrix(int[][] input) {
	    if (input == null)
	        return null;
	    int[][] result = new int[input.length][];
	    for (int r = 0; r < input.length; r++) {
	        result[r] = input[r].clone();
	    }
	    return result;
	}
	
	private int move(final int currentDepth, final int maximumDepth,
			final SimpleBoard board, Move mv, int player, int alpha, int beta) {

		// we are at max depth, return evaluation of this game state
		if (currentDepth == maximumDepth) {
			evaluatedCount++;
			
			int finval = evaluate(board,myPlayer);
			System.out.println(currentDepth + " TERMINAL("+mv.row+","+mv.col+") layer for " + (-player) + ": " + finval);
			return finval;
		}

		
		int max = Integer.MIN_VALUE; // we win
		int min = Integer.MAX_VALUE; // we lose

		Move curMove = new Move();
		Move bestMove = new Move();
		int moveVal;

		Boolean firstLoop = true;

		// get all child nodes and iterate through them
		while (getNextChildNode(curMove, board, firstLoop)) { // if i sort here
																// and search
																// best one
																// depths first
																// i can improve
																// efficiency

			firstLoop = false;
			SimpleBoard tempBoard = new SimpleBoard(deepCopyIntMatrix(board.getBoard()));
			tempBoard.getBoard()[curMove.row][curMove.col] = player;

			if (player == myPlayer) { // Then this is a max node

				moveVal = move(currentDepth + 1, maximumDepth, tempBoard,
						new Move(curMove.row,curMove.col), -player, alpha, beta);
				//System.out.println(currentDepth + " layer, move("+curMove.row+","+curMove.col+") for " + (player) + ": " + moveVal);
				if (moveVal > max) {
					bestMove.row = curMove.row;
					bestMove.col = curMove.col;
					max = moveVal;
				}
				/*
				 * if (alphaBetaPruningEnabled) { alpha = alpha > moveVal ?
				 * alpha : moveVal; if (alpha >= beta) { return beta; } }
				 */
			} else { // this is a LOSE node

				moveVal = move(currentDepth + 1, maximumDepth, tempBoard,
						new Move(curMove.row,curMove.col), -player, alpha, beta);
				//System.out.println(currentDepth + " layer, move("+curMove.row+","+curMove.col+") for " + (player) + ": " + moveVal);
				if (moveVal < min) {
					bestMove.row = curMove.row;
					bestMove.col = curMove.col;
					min = moveVal;
				}

				/*
				 * if (alphaBetaPruningEnabled) { beta = beta < moveVal ? beta :
				 * moveVal; if (beta <= alpha) { return alpha; } }
				 */
			}
		}

		System.out.println(currentDepth + " RETURN, chosen move("+bestMove.row+","+bestMove.col+") for " + (player) + ": " + (player == myPlayer ?  max :  min));
		mv.row = bestMove.row;
		mv.col = bestMove.col;
		if(currentDepth == 2 && bestMove.row == 0 && bestMove.col == 6 &&  (player == myPlayer ?  max :  min) == 2147483646)
			System.out.println("stop");
		 System.out.println("val "+player+" layer " + currentDepth +": " +  (player == myPlayer ?  max :  min));
		return (player == myPlayer ?  max :  min);
		/*
		 * if (alphaBetaPruningEnabled) { return turn ==
		 * GomokuConstants.BLACK_PIECE ? alpha : beta; }
		 */

	}

	private static boolean getNextChildNode(Move mv,
			final SimpleBoard rootBoard, Boolean firstLoop) {

		// Stupid node-list where i check EVERY free square..

		if (!firstLoop) {

			mv.col++;
			if (mv.col == rootBoard.getWidth()) {
				mv.row++;
				mv.col = 0;
			}
		}
		// All board checked
		if (mv.row == rootBoard.getHeight())
			return false;

		while (mv.row < rootBoard.getHeight()) {
			while (mv.col < rootBoard.getWidth()) {
				// check if square is empty and next to other pieces..
				if (rootBoard.getBoard()[mv.row][mv.col] == SimpleBoard.EMPTY
						&& hasAdjacentPieces(mv.row, mv.col, rootBoard)) {
					return true;
				}

				mv.col++;
			}

			mv.col = 0;
			mv.row++;
		}

		// there are no more child nodes
		return false;
	}

	private static boolean hasAdjacentPieces(int row, int col,
			SimpleBoard rootBoard) {

		if (col != 0) {
			if (rootBoard.getBoard()[row][col - 1] != SimpleBoard.EMPTY)
				return true;
		}

		if (col != rootBoard.getWidth() - 1) {
			if (rootBoard.getBoard()[row][col + 1] != SimpleBoard.EMPTY)
				return true;
		}

		if (row != 0) {
			if (rootBoard.getBoard()[row - 1][col] != SimpleBoard.EMPTY)
				return true;

			if (col != 0) {
				if (rootBoard.getBoard()[row - 1][col - 1] != SimpleBoard.EMPTY)
					return true;
			}

			if (col != rootBoard.getWidth() - 1) {
				if (rootBoard.getBoard()[row - 1][col + 1] != SimpleBoard.EMPTY)
					return true;
			}

		}

		if (row != rootBoard.getHeight() - 1) {
			if (rootBoard.getBoard()[row + 1][col] != SimpleBoard.EMPTY)
				return true;

			if (col != 0) {
				if (rootBoard.getBoard()[row + 1][col - 1] != SimpleBoard.EMPTY)
					return true;
			}

			if (col != rootBoard.getWidth() - 1) {
				if (rootBoard.getBoard()[row + 1][col + 1] != SimpleBoard.EMPTY)
					return true;
			}

		}

		return false;
	}

	@Override
	public String getName() {
		return "Oliver Kalmend";
	}

}
