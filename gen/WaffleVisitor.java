// Generated from C:/Users/Oliver/Documents/Java/IdeaProjects/WaffleCodeCompiler/src\Waffle.g4 by ANTLR 4.4.1-dev
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WaffleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WaffleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WaffleParser#call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_statement(@NotNull WaffleParser.Call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(@NotNull WaffleParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#buulean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuulean(@NotNull WaffleParser.BuuleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(@NotNull WaffleParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull WaffleParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#subroutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutine(@NotNull WaffleParser.SubroutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(@NotNull WaffleParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(@NotNull WaffleParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull WaffleParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#routine_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_name(@NotNull WaffleParser.Routine_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expVariable}
	 * labeled alternative in {@link WaffleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpVariable(@NotNull WaffleParser.ExpVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expUnary}
	 * labeled alternative in {@link WaffleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpUnary(@NotNull WaffleParser.ExpUnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(@NotNull WaffleParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull WaffleParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#for_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_header(@NotNull WaffleParser.For_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#elser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElser(@NotNull WaffleParser.ElserContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(@NotNull WaffleParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expBinary}
	 * labeled alternative in {@link WaffleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpBinary(@NotNull WaffleParser.ExpBinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_literal(@NotNull WaffleParser.Numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#decl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_statement(@NotNull WaffleParser.Decl_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#type_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_decl(@NotNull WaffleParser.Type_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#range_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_exp(@NotNull WaffleParser.Range_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOTIMPLEMENTED1}
	 * labeled alternative in {@link WaffleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOTIMPLEMENTED1(@NotNull WaffleParser.NOTIMPLEMENTED1Context ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#un_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUn_op(@NotNull WaffleParser.Un_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#indexed_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_expression(@NotNull WaffleParser.Indexed_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#dooble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDooble(@NotNull WaffleParser.DoobleContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#list_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_expression(@NotNull WaffleParser.List_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(@NotNull WaffleParser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#scalar_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_type(@NotNull WaffleParser.Scalar_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#elif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif(@NotNull WaffleParser.ElifContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_op(@NotNull WaffleParser.Bin_opContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expParenthesis}
	 * labeled alternative in {@link WaffleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpParenthesis(@NotNull WaffleParser.ExpParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(@NotNull WaffleParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(@NotNull WaffleParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(@NotNull WaffleParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expList}
	 * labeled alternative in {@link WaffleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpList(@NotNull WaffleParser.ExpListContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#variable_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_expression(@NotNull WaffleParser.Variable_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#assign_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_statement(@NotNull WaffleParser.Assign_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#subroutine_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutine_header(@NotNull WaffleParser.Subroutine_headerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expLiteral}
	 * labeled alternative in {@link WaffleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpLiteral(@NotNull WaffleParser.ExpLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull WaffleParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(@NotNull WaffleParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(@NotNull WaffleParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#ifer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfer(@NotNull WaffleParser.IferContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(@NotNull WaffleParser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaffleParser#literal_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_expression(@NotNull WaffleParser.Literal_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expCall}
	 * labeled alternative in {@link WaffleParser#call_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpCall(@NotNull WaffleParser.ExpCallContext ctx);
}