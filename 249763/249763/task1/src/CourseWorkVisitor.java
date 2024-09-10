// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CourseWorkParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CourseWorkVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CourseWorkParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CourseWorkParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CourseWorkParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(CourseWorkParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CourseWorkParser#vardec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardec(CourseWorkParser.VardecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CourseWorkParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(CourseWorkParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CourseWorkParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CourseWorkParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CourseWorkParser#ene}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEne(CourseWorkParser.EneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifiers}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers(CourseWorkParser.IdentifiersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integers}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegers(CourseWorkParser.IntegersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BOOLEAN}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBOOLEAN(CourseWorkParser.BOOLEANContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(CourseWorkParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinOpExpr}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpExpr(CourseWorkParser.BinOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDFRargs}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDFArgs(CourseWorkParser.IDFRargsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPRBlock}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPRBlock(CourseWorkParser.EXPRBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IFThenElse}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIFThenElse(CourseWorkParser.IFThenElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileDo}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileDo(CourseWorkParser.WhileDoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RepeatUntil}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatUntil(CourseWorkParser.RepeatUntilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(CourseWorkParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Space}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpace(CourseWorkParser.SpaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Newline}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline(CourseWorkParser.NewlineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Skip}
	 * labeled alternative in {@link CourseWorkParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(CourseWorkParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by {@link CourseWorkParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(CourseWorkParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CourseWorkParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(CourseWorkParser.BinopContext ctx);
}