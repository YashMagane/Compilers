import java.util.ArrayList;
import java.util.HashMap;

public class InterpreterStack {
    private final ArrayList<HashMap<String, Object>> stack = new ArrayList<>();
    public void push(HashMap<String, Object> vars) {
        stack.add(vars);
    }
    public HashMap<String, Object> pop() {
        return stack.remove(stack.size() - 1);
    }
    public Object get(String nameVariable) {
        return stack.get(stack.size() - 1).get(nameVariable);
    }
    public void put(String varName, Object value) {
        stack.get(stack.size() - 1).put(varName, value);
    }
    public int length()
    {
        return stack.size();
    }


}
