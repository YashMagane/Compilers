// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(LangParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(LangParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(LangParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinOpExpr}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpExpr(LangParser.BinOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileExpr}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExpr(LangParser.WhileExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(LangParser.IntExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link LangParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(LangParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessEqBinop}
	 * labeled alternative in {@link LangParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqBinop(LangParser.LessEqBinopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusBinop}
	 * labeled alternative in {@link LangParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusBinop(LangParser.PlusBinopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusBinop}
	 * labeled alternative in {@link LangParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusBinop(LangParser.MinusBinopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndBinop}
	 * labeled alternative in {@link LangParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndBinop(LangParser.AndBinopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XorBinop}
	 * labeled alternative in {@link LangParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorBinop(LangParser.XorBinopContext ctx);
}