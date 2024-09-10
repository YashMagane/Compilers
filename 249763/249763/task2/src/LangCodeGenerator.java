import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class LangCodeGenerator extends AbstractParseTreeVisitor<String> implements LangVisitor<String>
{
    private int numOfArgs;
    private List<TerminalNode> args;
    private final Map<String, Integer> localVars = new HashMap<>();
    private int labelCounter = 0;

    @Override public String visitProg(LangParser.ProgContext ctx)
    {
        numOfArgs = ctx.args().Idfr().size();
        args = ctx.args().Idfr();
        return visit(ctx.body());
    }
    @Override public String visitArgs(LangParser.ArgsContext ctx)
    {
        throw new RuntimeException("Wrong Input");
    }
    @Override public String visitBody(LangParser.BodyContext ctx)
    {
        if (numOfArgs + ctx.localvars.size() > 22) {     // x10 - x31
            throw new RuntimeException("Number of variables has exceeded the limit");
        }

        StringBuilder sb = new StringBuilder();

        sb.append("""
                main:
                    lw          ra, 41(sp)
                    addi        sp, sp, 41
                """
        );

        int regOffset = 10;

        for (int i = 0; i < numOfArgs; ++i) {
            localVars.put(args.get(i).getText(), i + regOffset);
            sb.append(
                String.format("""
                    lw          x%2d, 41(sp)
                    addi        sp, sp, 41
                """,
                i + regOffset
                )
            );
        }

        regOffset = regOffset + numOfArgs;

        sb.append("""
                    addi        sp, sp, 41
                """
        );

        for (int i = 0; i < ctx.localvars.size(); ++i) {
            localVars.put(ctx.localvars.get(i).getText(), i + regOffset);
            sb.append(visit(ctx.localvarsexps.get(i)));
            sb.append(
                String.format("""
                    lw          x%2d, 41(sp)
                    addi        sp, sp, 41
                """,
                i + regOffset
                )
            );
        }

        for (int i = 0; i < ctx.ene.size(); ++i) {
            sb.append(visit(ctx.ene.get(i)));
            if (i != ctx.ene.size() - 1) {
                if (
                       ctx.ene.get(i) instanceof LangParser.BinOpExprContext
                    || ctx.ene.get(i) instanceof LangParser.IntExprContext
                    || ctx.ene.get(i) instanceof LangParser.IdExprContext
                ) {

                    sb.append("""
                                Discard     41
                            """
                    );

                }
            }
        }

        sb.append("""
                    ret
                """
        );

        return sb.toString();

    }
    @Override public String visitAssignExpr(LangParser.AssignExprContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(visit(ctx.exp()));
        sb.append(
                String.format("""
                    PopReg      x%2d
                """,
                localVars.get(ctx.Idfr().getText())
                )
        );
        return sb.toString();
    }
    @Override public String visitBinOpExpr(LangParser.BinOpExprContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(visit(ctx.exp(1)));
        sb.append(visit(ctx.exp(0)));
        switch (((TerminalNode) (ctx.binop().getChild(0))).getSymbol().getType()) {
            case LangParser.LessEq -> {
                sb.append("""
                    CompLE
                """
                );
            }
            case LangParser.Plus -> {
                sb.append("""
                    Plus
                """
                );
            }
            case LangParser.Minus -> {
                sb.append("""
                    Minus
                """
                );
            }
            case LangParser.And -> {
                sb.append("""
                    LogicalAnd
                """
                );
            }
            case LangParser.Xor -> {
                sb.append("""
                    LogicalXor
                """
                );
            }
            default -> {
                throw new RuntimeException("Shouldn't be here - wrong binary operator.");
            }
        }

        return sb.toString();
    }
    @Override public String visitWhileExpr(LangParser.WhileExprContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        String loopLabel = String.format("label_%d", labelCounter++);
        String exitLabel = String.format("label_%d", labelCounter++);
        sb.append(
                String.format("""
                %s:
                """,
                loopLabel)
        );

        sb.append(visit(ctx.exp()));
        sb.append(
                String.format("""
                    PushImm     1
                    LogicalXor
                    JumpTrue    %s
                """,
                exitLabel)
        );
        sb.append(visit(ctx.block()));
        sb.append(
                String.format("""
                    Jump        %s
                """,
                loopLabel)
        );
        sb.append(
                String.format("""
                    %s:
                    """,
                    exitLabel)
        );
        return sb.toString();
    }
    @Override public String visitIntExpr(LangParser.IntExprContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(
                String.format("""
                    PushImm     %d
                """,
                Integer.parseInt(ctx.IntLit().getText())
                )
        );
        return sb.toString();
    }
    @Override public String visitIdExpr(LangParser.IdExprContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(
                String.format("""
                    PushReg     x%2d
                """,
                localVars.get(ctx.Idfr().getText())
                )
        );
        return sb.toString();
    }
    @Override public String visitBlock(LangParser.BlockContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.exps.size(); ++i) {
            sb.append(visit(ctx.exps.get(i)));
            if (
                   ctx.exps.get(i) instanceof LangParser.BinOpExprContext
                || ctx.exps.get(i) instanceof LangParser.IntExprContext
                || ctx.exps.get(i) instanceof LangParser.IdExprContext
                ) {
                sb.append("""
                    Discard     41
                """
                );
            }
        }

        return sb.toString();

    }
    @Override public String visitLessEqBinop(LangParser.LessEqBinopContext ctx)
    {
        throw new RuntimeException("Wrong Input");
    }
    @Override public String visitPlusBinop(LangParser.PlusBinopContext ctx)
    {
        throw new RuntimeException("Wrong Input");
    }
    @Override public String visitMinusBinop(LangParser.MinusBinopContext ctx)
    {
        throw new RuntimeException("Wrong Input");
    }
    @Override public String visitAndBinop(LangParser.AndBinopContext ctx)
    {
        throw new RuntimeException("Wrong Input");
    }
    @Override public String visitXorBinop(LangParser.XorBinopContext ctx)
    {
        throw new RuntimeException("Wrong Input");
    }

}
