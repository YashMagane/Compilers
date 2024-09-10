// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CourseWorkParser}.
 */
public interface CourseWorkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CourseWorkParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CourseWorkParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CourseWorkParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CourseWorkParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CourseWorkParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(CourseWorkParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CourseWorkParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(CourseWorkParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CourseWorkParser#vardec}.
	 * @param ctx the parse tree
	 */
	void enterVardec(CourseWorkParser.VardecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CourseWorkParser#vardec}.
	 * @param ctx the parse tree
	 */
	void exitVardec(CourseWorkParser.VardecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CourseWorkParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(CourseWorkParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CourseWorkParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(CourseWorkParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CourseWorkParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CourseWorkParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CourseWorkParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CourseWorkParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CourseWorkParser#ene}.
	 * @param ctx the parse tree
	 */
	void enterEne(CourseWorkParser.EneContext ctx);
	/**
	 * Exit a parse tree produced by {@link CourseWorkParser#ene}.
	 * @param ctx the parse tree
	 */
	void exitEne(CourseWorkParser.EneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifiers}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers(CourseWorkParser.IdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifiers}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers(CourseWorkParser.IdentifiersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integers}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntegers(CourseWorkParser.IntegersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integers}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntegers(CourseWorkParser.IntegersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BOOLEAN}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBOOLEAN(CourseWorkParser.BOOLEANContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BOOLEAN}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBOOLEAN(CourseWorkParser.BOOLEANContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(CourseWorkParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(CourseWorkParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinOpExpr}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinOpExpr(CourseWorkParser.BinOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinOpExpr}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinOpExpr(CourseWorkParser.BinOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDFRargs}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIDFRargs(CourseWorkParser.IDFRargsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDFRargs}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIDFRargs(CourseWorkParser.IDFRargsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPRBlock}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEXPRBlock(CourseWorkParser.EXPRBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPRBlock}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEXPRBlock(CourseWorkParser.EXPRBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IFThenElse}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIFThenElse(CourseWorkParser.IFThenElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IFThenElse}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIFThenElse(CourseWorkParser.IFThenElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileDo}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWhileDo(CourseWorkParser.WhileDoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileDo}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWhileDo(CourseWorkParser.WhileDoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RepeatUntil}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRepeatUntil(CourseWorkParser.RepeatUntilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RepeatUntil}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRepeatUntil(CourseWorkParser.RepeatUntilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CourseWorkParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CourseWorkParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Space}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSpace(CourseWorkParser.SpaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Space}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSpace(CourseWorkParser.SpaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Newline}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewline(CourseWorkParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Newline}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewline(CourseWorkParser.NewlineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Skip}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSkip(CourseWorkParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Skip}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSkip(CourseWorkParser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by {@link CourseWorkParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CourseWorkParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CourseWorkParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CourseWorkParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CourseWorkParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(CourseWorkParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CourseWorkParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(CourseWorkParser.BinopContext ctx);
}