// Generated from C:/Users/Oliver/Documents/Java/IdeaProjects/WaffleCodeCompiler/src\Waffle.g4 by ANTLR 4.4.1-dev
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WaffleParser}.
 */
public interface WaffleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WaffleParser#call_statement}.
	 * @param ctx the parse tree
	 */
	void enterCall_statement(@NotNull WaffleParser.Call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#call_statement}.
	 * @param ctx the parse tree
	 */
	void exitCall_statement(@NotNull WaffleParser.Call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull WaffleParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull WaffleParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#buulean}.
	 * @param ctx the parse tree
	 */
	void enterBuulean(@NotNull WaffleParser.BuuleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#buulean}.
	 * @param ctx the parse tree
	 */
	void exitBuulean(@NotNull WaffleParser.BuuleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(@NotNull WaffleParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(@NotNull WaffleParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull WaffleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull WaffleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#subroutine}.
	 * @param ctx the parse tree
	 */
	void enterSubroutine(@NotNull WaffleParser.SubroutineContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#subroutine}.
	 * @param ctx the parse tree
	 */
	void exitSubroutine(@NotNull WaffleParser.SubroutineContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(@NotNull WaffleParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(@NotNull WaffleParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(@NotNull WaffleParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(@NotNull WaffleParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull WaffleParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull WaffleParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#routine_name}.
	 * @param ctx the parse tree
	 */
	void enterRoutine_name(@NotNull WaffleParser.Routine_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#routine_name}.
	 * @param ctx the parse tree
	 */
	void exitRoutine_name(@NotNull WaffleParser.Routine_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expVariable}
	 * labeled alternative in {@link WaffleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpVariable(@NotNull WaffleParser.ExpVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expVariable}
	 * labeled alternative in {@link WaffleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpVariable(@NotNull WaffleParser.ExpVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expUnary}
	 * labeled alternative in {@link WaffleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpUnary(@NotNull WaffleParser.ExpUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expUnary}
	 * labeled alternative in {@link WaffleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpUnary(@NotNull WaffleParser.ExpUnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(@NotNull WaffleParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(@NotNull WaffleParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull WaffleParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull WaffleParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#for_header}.
	 * @param ctx the parse tree
	 */
	void enterFor_header(@NotNull WaffleParser.For_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#for_header}.
	 * @param ctx the parse tree
	 */
	void exitFor_header(@NotNull WaffleParser.For_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#elser}.
	 * @param ctx the parse tree
	 */
	void enterElser(@NotNull WaffleParser.ElserContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#elser}.
	 * @param ctx the parse tree
	 */
	void exitElser(@NotNull WaffleParser.ElserContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(@NotNull WaffleParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(@NotNull WaffleParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expBinary}
	 * labeled alternative in {@link WaffleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpBinary(@NotNull WaffleParser.ExpBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expBinary}
	 * labeled alternative in {@link WaffleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpBinary(@NotNull WaffleParser.ExpBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(@NotNull WaffleParser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(@NotNull WaffleParser.Numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#decl_statement}.
	 * @param ctx the parse tree
	 */
	void enterDecl_statement(@NotNull WaffleParser.Decl_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#decl_statement}.
	 * @param ctx the parse tree
	 */
	void exitDecl_statement(@NotNull WaffleParser.Decl_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void enterType_decl(@NotNull WaffleParser.Type_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void exitType_decl(@NotNull WaffleParser.Type_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#range_exp}.
	 * @param ctx the parse tree
	 */
	void enterRange_exp(@NotNull WaffleParser.Range_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#range_exp}.
	 * @param ctx the parse tree
	 */
	void exitRange_exp(@NotNull WaffleParser.Range_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOTIMPLEMENTED1}
	 * labeled alternative in {@link WaffleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNOTIMPLEMENTED1(@NotNull WaffleParser.NOTIMPLEMENTED1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code NOTIMPLEMENTED1}
	 * labeled alternative in {@link WaffleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNOTIMPLEMENTED1(@NotNull WaffleParser.NOTIMPLEMENTED1Context ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#un_op}.
	 * @param ctx the parse tree
	 */
	void enterUn_op(@NotNull WaffleParser.Un_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#un_op}.
	 * @param ctx the parse tree
	 */
	void exitUn_op(@NotNull WaffleParser.Un_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#indexed_expression}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_expression(@NotNull WaffleParser.Indexed_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#indexed_expression}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_expression(@NotNull WaffleParser.Indexed_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#dooble}.
	 * @param ctx the parse tree
	 */
	void enterDooble(@NotNull WaffleParser.DoobleContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#dooble}.
	 * @param ctx the parse tree
	 */
	void exitDooble(@NotNull WaffleParser.DoobleContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#list_expression}.
	 * @param ctx the parse tree
	 */
	void enterList_expression(@NotNull WaffleParser.List_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#list_expression}.
	 * @param ctx the parse tree
	 */
	void exitList_expression(@NotNull WaffleParser.List_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(@NotNull WaffleParser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(@NotNull WaffleParser.Code_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#scalar_type}.
	 * @param ctx the parse tree
	 */
	void enterScalar_type(@NotNull WaffleParser.Scalar_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#scalar_type}.
	 * @param ctx the parse tree
	 */
	void exitScalar_type(@NotNull WaffleParser.Scalar_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#elif}.
	 * @param ctx the parse tree
	 */
	void enterElif(@NotNull WaffleParser.ElifContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#elif}.
	 * @param ctx the parse tree
	 */
	void exitElif(@NotNull WaffleParser.ElifContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_op(@NotNull WaffleParser.Bin_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_op(@NotNull WaffleParser.Bin_opContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expParenthesis}
	 * labeled alternative in {@link WaffleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpParenthesis(@NotNull WaffleParser.ExpParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expParenthesis}
	 * labeled alternative in {@link WaffleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpParenthesis(@NotNull WaffleParser.ExpParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(@NotNull WaffleParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(@NotNull WaffleParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull WaffleParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull WaffleParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(@NotNull WaffleParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(@NotNull WaffleParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expList}
	 * labeled alternative in {@link WaffleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpList(@NotNull WaffleParser.ExpListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expList}
	 * labeled alternative in {@link WaffleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpList(@NotNull WaffleParser.ExpListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#variable_expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable_expression(@NotNull WaffleParser.Variable_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#variable_expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable_expression(@NotNull WaffleParser.Variable_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_statement(@NotNull WaffleParser.Assign_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_statement(@NotNull WaffleParser.Assign_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#subroutine_header}.
	 * @param ctx the parse tree
	 */
	void enterSubroutine_header(@NotNull WaffleParser.Subroutine_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#subroutine_header}.
	 * @param ctx the parse tree
	 */
	void exitSubroutine_header(@NotNull WaffleParser.Subroutine_headerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expLiteral}
	 * labeled alternative in {@link WaffleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpLiteral(@NotNull WaffleParser.ExpLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expLiteral}
	 * labeled alternative in {@link WaffleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpLiteral(@NotNull WaffleParser.ExpLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull WaffleParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull WaffleParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull WaffleParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull WaffleParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(@NotNull WaffleParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(@NotNull WaffleParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#ifer}.
	 * @param ctx the parse tree
	 */
	void enterIfer(@NotNull WaffleParser.IferContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#ifer}.
	 * @param ctx the parse tree
	 */
	void exitIfer(@NotNull WaffleParser.IferContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(@NotNull WaffleParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(@NotNull WaffleParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WaffleParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_expression(@NotNull WaffleParser.Literal_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WaffleParser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_expression(@NotNull WaffleParser.Literal_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expCall}
	 * labeled alternative in {@link WaffleParser#call_expression}.
	 * @param ctx the parse tree
	 */
	void enterExpCall(@NotNull WaffleParser.ExpCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expCall}
	 * labeled alternative in {@link WaffleParser#call_expression}.
	 * @param ctx the parse tree
	 */
	void exitExpCall(@NotNull WaffleParser.ExpCallContext ctx);
}