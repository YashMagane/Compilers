import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class CourseWorkTask1 {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("N:\\Documents\\Compilers3RD\\249763\\task1\\src\\input.txt");
        CourseWorkLexer lexer = new CourseWorkLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CourseWorkParser parser = new CourseWorkParser(tokens);
        CourseWorkParser.ProgContext tree = parser.;
        CourseWorkChecker checker = new CourseWorkChecker();
        try {
            checker.visit(tree);
        } catch (CourseWorkTypeException ex) {
            System.out.println(ex.report());
            return;
        }

        CourseWorkInterpreter interpreter = new CourseWorkInterpreter();
        Integer mainReturnValue = interpreter.visitProg(tree);
        System.out.println("TERMINATION");
        System.out.println(mainReturnValue);
    }
}
