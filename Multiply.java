import java.util.Map;

/**
 * Represents a multiplication operation between two expressions
 */
class Multiply extends Operation {
    /**
     * Constructs a Multiply object with the specified left and right expressions
     *
     * @param left  the left expression
     * @param right the right expression
     */
    public Multiply(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Interprets the multiplication operation by evaluating the left and right expressions
     * and multiplying their results
     *
     * @param context the context containing variable-value mappings
     */
    @Override
    public int interpret(Map<String, Integer> context) {
        return left.interpret(context) * right.interpret(context);
    }
}