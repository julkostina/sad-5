
/**
 * Represents a binary operation in an expression.
 */
abstract class Operation implements Expression {
    protected Expression left;
    protected Expression right;

    /**
     * Constructs an Operation object with the specified left and right expressions
     *
     * @param left  the left expression
     * @param right the right expression
     */
    public Operation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}