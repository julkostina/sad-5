import java.util.Map;

/**
 * Represents a number in an expression
 */
class Number implements Expression {
    private int value;

    /**
     * Constructs a Number object with the specified value
     *
     * @param value the value of the number
     */
    public Number(int value) {
        this.value = value;
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        return value;
    }
}