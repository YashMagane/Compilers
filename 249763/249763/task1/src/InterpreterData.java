import java.util.ArrayList;

public class InterpreterData {


    private final String name;
    private final CourseWorkParser.BodyContext body;
    private final ArrayList<String> params;


    public InterpreterData(String name, CourseWorkParser.BodyContext body, ArrayList<String> params) {
        this.name = name;
        this.body = body;
        this.params = params;
    }

    public CourseWorkParser.BodyContext getBody() {
        return body;
    }

    public ArrayList<String> getParams() {
        return params;
    }

    public String getName() {
        return name;
    }

}
