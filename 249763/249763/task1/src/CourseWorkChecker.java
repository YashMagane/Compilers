import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;


public class CourseWorkChecker extends AbstractParseTreeVisitor<CourseWorkTypes> implements CourseWorkVisitor<CourseWorkTypes> {

    private final Map<String,CourseWorkTypes> localVars = new HashMap<>();
    private final Map<String, Integer> mains = new HashMap<>();

    public CourseWorkTypes convertType(TerminalNode type) {
        if (type.getText().equals("BOOL")) {
            return CourseWorkTypes.BOOL;
        }
        if(type.getText().equals("int")){
            return CourseWorkTypes.INT;
        }
        return CourseWorkTypes.UNIT;
    }
    @Override
    public CourseWorkTypes visitProg(CourseWorkParser.ProgContext ctx) {
        boolean checkMain = false;
        for (int i = 0; i < ctx.dec().size(); i++) {
            if (localVars.containsKey(ctx.dec(i).IDFR().getText())) {
                throw new CourseWorkTypeException().duplicatedVarError();
            } else if (ctx.dec(i).TYPE().getText().equals("int")) {
                localVars.put(ctx.dec(i).IDFR().getText(), CourseWorkTypes.INT);

            } else if (localVars.containsKey(ctx.dec(i).IDFR().getText())) {
                throw new CourseWorkTypeException().duplicatedVarError();
            } else if (ctx.dec(i).TYPE().getText().equals("bool")) {
                localVars.put(ctx.dec(i).IDFR().getText(), CourseWorkTypes.BOOL);

            } else if (localVars.containsKey(ctx.dec(i).IDFR().getText())) {
                throw new CourseWorkTypeException().duplicatedVarError();
            } else if (ctx.dec(i).TYPE().getText().equals("unit")) {
                localVars.put(ctx.dec(i).IDFR().getText(), CourseWorkTypes.UNIT);
            }
        }
        for (int i = 0; i < localVars.size(); i++) {
            if (!localVars.containsKey("main")) {
                throw new CourseWorkTypeException().noMainFuncError();
            } else if (localVars.get("main") != CourseWorkTypes.INT) {
                throw new CourseWorkTypeException().mainReturnTypeError();
            }
        }

        return null;
    }

    @Override
    public CourseWorkTypes visitDec(CourseWorkParser.DecContext ctx) {
        CourseWorkTypes returnType = convertType(ctx.TYPE());
        String identifier = ctx.IDFR().getText();

        if(!localVars.containsKey(identifier)){
            throw new CourseWorkTypeException().undefinedFuncError();
        }

        if(localVars.containsKey(identifier)){
            throw new CourseWorkTypeException().duplicatedVarError();
        }
        localVars.put(identifier, returnType);
        visitVardec(ctx.vardec());
        CourseWorkTypes body = visitBody(ctx.body());
        if(body != returnType){throw new CourseWorkTypeException().functionBodyError(); }

        return returnType;
    }

    @Override
    public CourseWorkTypes visitVardec(CourseWorkParser.VardecContext ctx) {
        return null;
    }

    @Override
    public CourseWorkTypes visitBody(CourseWorkParser.BodyContext ctx) {
        for (int i = 0; i < ctx.localvar.size(); ++i) {
            CourseWorkTypes eType = visit(ctx.localvarexpr.get(i));
            if (eType != CourseWorkTypes.INT) {
                throw new CourseWorkTypeException().assignmentError();
            }
            if (localVars.containsKey(ctx.localvar.get(i).getText())) {
                throw new CourseWorkTypeException().duplicatedVarError();
            }
            localVars.put(ctx.localvar.get(i).getText(), CourseWorkTypes.INT);
        }
        CourseWorkTypes returnType = CourseWorkTypes.UNIT;
        for (int i = 0; i < ctx.ene().expr().size(); ++i) {
            CourseWorkParser.ExprContext expr = ctx.ene().expr().get(i);
            returnType = visit(expr);
        }
        return returnType;
    }

    @Override
    public CourseWorkTypes visitBlock(CourseWorkParser.BlockContext ctx) {
        for (int i = 0; i < ctx. ene().expr().size(); ++i) {
            visit(ctx.ene().expr(i));
        }
        return null;
    }

    @Override
    public CourseWorkTypes visitEne(CourseWorkParser.EneContext ctx) {
        int finalExpr = ctx.expr().size() - 1;
        for (int i = 0; i < finalExpr; i++){
            visit(ctx.expr(i));
        }
        return visit(ctx.expr(finalExpr));
    }

    @Override
    public CourseWorkTypes visitIdentifiers(CourseWorkParser.IdentifiersContext ctx) {
        if (!localVars.containsKey(ctx.IDFR().getText())) {
            throw new CourseWorkTypeException().undefinedVarError();
        }
        return CourseWorkTypes.INT;
    }

    @Override
    public CourseWorkTypes visitIntegers(CourseWorkParser.IntegersContext ctx) {
        return CourseWorkTypes.INT;
    }

    @Override
    public CourseWorkTypes visitBOOLEAN(CourseWorkParser.BOOLEANContext ctx) {
        return CourseWorkTypes.BOOL;
    }

    @Override
    public CourseWorkTypes visitAssignExpr(CourseWorkParser.AssignExprContext ctx) {
        if (!localVars.containsKey(ctx.IDFR().getText())) {
            throw new CourseWorkTypeException().undefinedVarError();
        }
        if (visit(ctx.expr()) != CourseWorkTypes.INT) {
            throw new CourseWorkTypeException().assignmentError();
        }
        return CourseWorkTypes.UNIT;
    }

    @Override
    public CourseWorkTypes visitBinOpExpr(CourseWorkParser.BinOpExprContext ctx) {
        CourseWorkTypes number1Type = visit(ctx.expr(0));
        CourseWorkTypes number2Type = visit(ctx.expr(1));

        return switch (((TerminalNode) (ctx.binop().getChild(0))).getSymbol().getType()) {
            case CourseWorkParser.MoreEq, CourseWorkParser.LessEq -> {
                if (number1Type != CourseWorkTypes.INT || number2Type != CourseWorkTypes.INT) {
                    throw new CourseWorkTypeException().comparisonError();
                }
                yield CourseWorkTypes.BOOL;
            }

            case CourseWorkParser.Plus, CourseWorkParser.Divide, CourseWorkParser.Times, CourseWorkParser.Minus -> {
                if (number1Type != CourseWorkTypes.INT || number2Type != CourseWorkTypes.INT) {
                    throw new CourseWorkTypeException().arithmeticError();
                }
                yield CourseWorkTypes.INT;
            }

            case CourseWorkParser.And, CourseWorkParser.Xor -> {
                if (number1Type != CourseWorkTypes.BOOL || number2Type != CourseWorkTypes.BOOL) {
                    throw new CourseWorkTypeException().logicalError();
                }
                yield CourseWorkTypes.BOOL;
            }
            default -> {
                throw new RuntimeException("Wrong binary operator used, Please use another one.");
            }
        };
    }

    @Override
    public CourseWorkTypes visitIDFArgs(CourseWorkParser.IDFRargsContext ctx) {
        return null;
    }

    @Override
    public CourseWorkTypes visitEXPRBlock(CourseWorkParser.EXPRBlockContext ctx) {
        return visit(ctx.block());
    }

    @Override
    public CourseWorkTypes visitIFThenElse(CourseWorkParser.IFThenElseContext ctx) {
        if(!visit(ctx.expr()).equals(CourseWorkTypes.BOOL)) {
            throw new CourseWorkTypeException().conditionError();
        }
        if(!visit(ctx.block(0)).equals(visit(ctx.block(1)))) {
            throw new CourseWorkTypeException().branchMismatchError();
        }
        return visit(ctx.block(0));
    }

    @Override
    public CourseWorkTypes visitWhileDo(CourseWorkParser.WhileDoContext ctx) {
        if (visit(ctx.expr()) != CourseWorkTypes.BOOL) {
            throw new CourseWorkTypeException().conditionError();
        }
        if  (visit(ctx.block()) != CourseWorkTypes.UNIT) {
            throw new CourseWorkTypeException().loopBodyError();
        }
        return CourseWorkTypes.UNIT;
    }

    @Override
    public CourseWorkTypes visitRepeatUntil(CourseWorkParser.RepeatUntilContext ctx) {
        if  (visit(ctx.block()) != CourseWorkTypes.UNIT) {
            throw new CourseWorkTypeException().loopBodyError();
        }
        if (visit(ctx.expr()) != CourseWorkTypes.BOOL) {
            throw new CourseWorkTypeException().conditionError();
        }
        return CourseWorkTypes.UNIT;
    }

    @Override
    public CourseWorkTypes visitPrint(CourseWorkParser.PrintContext ctx) {
        if (visit(ctx.expr()).equals(CourseWorkTypes.INT)||ctx.expr().getText().equals("space")||ctx.expr().getText().equals("newline")) {
            return CourseWorkTypes.UNIT;
        }
        throw new CourseWorkTypeException().printError();
    }

    @Override
    public CourseWorkTypes visitSpace(CourseWorkParser.SpaceContext ctx) {
        return CourseWorkTypes.UNIT;
    }

    @Override
    public CourseWorkTypes visitNewline(CourseWorkParser.NewlineContext ctx) {
        return  CourseWorkTypes.UNIT;
    }

    @Override
    public CourseWorkTypes visitSkip(CourseWorkParser.SkipContext ctx) {
        return CourseWorkTypes.UNIT;
    }

    @Override
    public CourseWorkTypes visitArgs(CourseWorkParser.ArgsContext ctx) {
        return null;
    }

    @Override
    public CourseWorkTypes visitBinop(CourseWorkParser.BinopContext ctx) {
        return null;
    }
}
