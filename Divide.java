import java.util.Map;

/**
 * Represents a division operation between two expressions
 */
class Divide extends Operation {
    /**
     * Constructs a Divide object with the given left and right expressions
     *
     * @param left  the left expression
     * @param right the right expression
     */
    public Divide(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Interprets the division operation by evaluating the left and right expressions
     * and dividing the result of the left expression by the result of the right expression
     *
     * @param context the context containing variable values
     * @return the result of the division operation
     */
    @Override
    public int interpret(Map<String, Integer> context) {
        return left.interpret(context) / right.interpret(context);
    }
}