import java.util.Map;
import java.util.Stack;


/**
 * Responsible for evaluating arithmetic expressions. 
 * It takes an expression as input and builds a syntax tree using the provided tokens.
 */
class Evaluator  {
    private Expression syntaxTree;

    /**
     * Constructs an Evaluator object with the given expression
     * The expression is evaluated and a syntax tree is created using a stack-based algorithm
     * 
     * @param expression the expression to be evaluated
     */
    public Evaluator(String expression ) {
        Stack<Expression> expressionStack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (token.matches("\\d+")) {
                expressionStack.push(new Number(Integer.parseInt(token)));
            } else if (token.matches("[*/+-]")) {


                Expression right = expressionStack.pop();
                Expression left = expressionStack.pop();

                if (token.equals("+")) {
                    expressionStack.push(new Add(left, right));
                } else if (token.equals("-")) {
                    expressionStack.push(new Subtract(left, right));
                } else if (token.equals("*")) {
                    expressionStack.push(new Multiply(left, right));
                } else if (token.equals("/")) {
                    expressionStack.push(new Divide(left, right));
                }
            }
            else{
                expressionStack.push(new Variable(token));
            }
        }
        if (expressionStack.isEmpty()) {
            throw new IllegalArgumentException("Invalid expression");
        }
        syntaxTree = expressionStack.pop();
    }

    /**
     * Evaluates the syntax tree using the given context
     *
     * @param context the map containing variable names and their corresponding values
     */
    public int evaluate(Map<String, Integer> context) {
        return syntaxTree.interpret(context);
    }
}