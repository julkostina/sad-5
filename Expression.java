import java.util.Map;

/**
 * The Expression interface represents an expression that can be interpreted
 * and evaluated in the given context
 */
interface Expression {
    int interpret(Map<String, Integer> context);
}


