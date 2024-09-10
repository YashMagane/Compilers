import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public abstract class CourseWorkInterpreter extends CourseWorkBaseVisitor<Integer>{
    private HashMap<String, InterpreterData> functions;
    private final InterpreterStack stack;

    public CourseWorkInterpreter() {
        this.functions = new HashMap<>();
        stack = new InterpreterStack();
    }

    @Override
    public Integer visitProg(CourseWorkParser.ProgContext ctx) {
        for (int i = 0; i < ctx.dec().size(); i++) {
            CourseWorkParser.DecContext thisFunc = ctx.dec(i);
            int argCount = thisFunc.vardec().IDFR().size();
            String funcName = thisFunc.IDFR().getText();
            CourseWorkParser.BodyContext funcBody = thisFunc.body();
            ArrayList<String> funcPara = new ArrayList<>();
            InterpreterData main = functions.get("main");
            for (int j = 0; j < argCount; j++) {
                funcPara.add(thisFunc.vardec().IDFR(j).getText());
            }
            functions.put(funcName, new InterpreterData(funcName, funcBody, funcPara));
        }
        return visitBody(ctx.body());
    }

    @Override
    public Integer visitDec(CourseWorkParser.DecContext ctx) {
        return super.visitDec(ctx);
    }

    @Override
    public Integer visitVardec(CourseWorkParser.VardecContext ctx) {
        return super.visitVardec(ctx);
    }

    @Override
    public Integer visitBody(CourseWorkParser.BodyContext ctx) {
        {
            for ( int i = 0; i < ctx.localvar.size(); i++) {
                stack.put(ctx.localvar.get(i).getText(), visit(ctx.localvarexpr.get(i)));
            }
        }
        return visit(ctx.ene());
    }

    @Override
    public Integer visitBlock(CourseWorkParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override
    public Integer visitEne(CourseWorkParser.EneContext ctx) {

        Iterator<CourseWorkParser.ExprContext> lastValue = ctx.expr().iterator();
        CourseWorkParser.ExprContext exprGiven = lastValue.next();

        while (lastValue.hasNext()) {
            visit(exprGiven);
            exprGiven = lastValue.next();
        }
        return visit(exprGiven);
    }

    @Override
    public Integer visitIdentifiers(CourseWorkParser.IdentifiersContext ctx) {
        return (int) stack.get(ctx.getText());
    }

    @Override
    public Integer visitIntegers(CourseWorkParser.IntegersContext ctx) {
        int values = Integer.parseInt(ctx.getText());
        return values;
    }

    @Override
    public Integer visitBOOLEAN(CourseWorkParser.BOOLEANContext ctx) {
        if  (ctx.getText().equals("true")){
            return (1);
        }
          return (0);
    }

    @Override
    public Integer visitAssignExpr(CourseWorkParser.AssignExprContext ctx) {
        String NameVariable = ctx.IDFR().getText();
        Integer expression = visit(ctx.expr());
        stack.put(NameVariable, expression);
        return super.visitAssignExpr(ctx);
    }

    @Override
    public Integer visitBinOpExpr(CourseWorkParser.BinOpExprContext ctx) {

        Integer number1 = visit(ctx.expr(0));
        Integer number2 = visit(ctx.expr(1));

        switch (((TerminalNode) (ctx.binop().getChild(0))).getSymbol().getType()) {

            case CourseWorkParser.LessEq -> {

                return ((number1 <= number2) ? 1 : 0);

            }
            case CourseWorkParser.MoreEq ->  {

                return ((number1 >= number2) ? 1 : 0);

            }

            case CourseWorkParser.Plus -> {

                return number1 + number2;

            }

            case CourseWorkParser.Times -> {

                return number1 * number2;
            }
            case CourseWorkParser.LogicalOr -> {

                return number1 | number2;
            }
            case CourseWorkParser.More -> {

                return  ((number1 > number2) ? 1 : 0);

            }
            case CourseWorkParser.Less-> {

                return ((number1 < number2) ? 1 : 0);
            }

            case CourseWorkParser.Quality -> {

                return ((number1 == number2) ? 1 : 0);
            }
            case CourseWorkParser.Minus -> {

                return number1 - number2;

            }
            case CourseWorkParser.And -> {

                return number1 & number2;

            }

            case CourseWorkParser.Divide -> {

                return number1 / number2;
            }

            case CourseWorkParser.Xor -> {

                return number1 ^ number2;

            }
             default -> {
                throw new RuntimeException("Wrong binary operator used, Please use another one.");
            }
        }
    }

    @Override
    public Integer visitIDFRargs(CourseWorkParser.IDFRargsContext ctx) {
        ArrayList<String> Para = functions.get(ctx.IDFR()).getParams();
        stack.push(new HashMap<>());
        for (int i = 0; i < Para.size(); i++){
            stack.put(Para.get(i),visit(ctx.args().expr(i)));
        }
        Integer returnNumber = visitBody(functions.get(ctx.IDFR()).getBody());
        stack.pop();
        return  returnNumber;
    }

    @Override
    public Integer visitEXPRBlock(CourseWorkParser.EXPRBlockContext ctx) {                       // todo
        return super.visitEXPRBlock(ctx);
    }

    @Override
    public Integer visitIFThenElse(CourseWorkParser.IFThenElseContext ctx) {
        return super.visitIFThenElse(ctx);
    }

    @Override
    public Integer visitWhileDo(CourseWorkParser.WhileDoContext ctx) {
        CourseWorkParser.ExprContext condition = ctx.expr();
        CourseWorkParser.BlockContext block = ctx.block();
        visitBlock(block);
        return super.visitWhileDo(ctx);
    }

    @Override
    public Integer visitRepeatUntil(CourseWorkParser.RepeatUntilContext ctx) {
        return super.visitRepeatUntil(ctx);
    }

    @Override
    public Integer visitPrint(CourseWorkParser.PrintContext ctx) {
        return super.visitPrint(ctx);
    }

    @Override
    public Integer visitSpace(CourseWorkParser.SpaceContext ctx) {
        return super.visitSpace(ctx);
    }

    @Override
    public Integer visitNewline(CourseWorkParser.NewlineContext ctx) {
        return super.visitNewline(ctx);
    }

    @Override
    public Integer visitSkip(CourseWorkParser.SkipContext ctx) {
        return super.visitSkip(ctx);
    }

    @Override
    public Integer visitArgs(CourseWorkParser.ArgsContext ctx) {
        return super.visitArgs(ctx);
    }

    @Override
    public Integer visitBinop(CourseWorkParser.BinopContext ctx) {
        return super.visitBinop(ctx);
    }
}