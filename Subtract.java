import java.util.Map;

/**
 * Represents a subtraction operation between two expressions
 */
class Subtract extends Operation {
    /**
     * Constructs a Subtract object with the given left and right expressions
     *
     * @param left  the left expression
     * @param right the right expression
     */
    public Subtract(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Interprets the subtraction operation by evaluating the left and right expressions
     * and subtracting the result of the right expression from the result of the left expression
     *
     * @param context the context containing variable-value mappings
     */
    @Override
    public int interpret(Map<String, Integer> context) {
        return left.interpret(context) - right.interpret(context);
    }
}