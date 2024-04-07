import java.util.Map;

/**
 * Represents a variable in an expression
 */
public class Variable implements Expression {
    private String name;

    /**
     * Constructs a new Variable object with the specified name
     *
     * @param name the name of the variable
     */
    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        if (context.containsKey(name)) {
            return context.get(name);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
