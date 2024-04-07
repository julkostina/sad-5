import java.util.Map;


/**
 * Represents an addition operation between two expressions
 */
class Add extends Operation {
    /**
     * Constructs a new Add object with the specified left and right expressions
     *
     * @param left  the left expression
     * @param right the right expression
     */
    public Add(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Interprets the addition operation by evaluating the left and right expressions
     * and returning their sum.
     *
     * @param context the context containing variable values
     * @return the sum of the left and right expressions
     */
    @Override
    public int interpret(Map<String, Integer> context) {
        return left.interpret(context) + right.interpret(context);
    }
}