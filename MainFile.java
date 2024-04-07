import java.util.HashMap;
import java.util.Map;

/**
 * The MainFile class is the entry point of the program
 * demonstrates the usage of the Evaluator class to evaluate mathematical expressions
 */
public class MainFile {
    public static void main(String[] args) {
        String expression = "5 6 * 2 / 10 -";
        Evaluator evaluator = new Evaluator(expression);
        Map<String, Integer> context = new HashMap<>();
        int result = evaluator.evaluate(context);
        System.out.println("Result of expression " + expression + " = " + result);

        Evaluator evaluator1 = new Evaluator("30 2 / 3 - 6 /");
        Map<String, Integer> context1 = new HashMap<>();
        int result1 = evaluator1.evaluate(context);
        System.out.println("Result of expression " +  "30 2 / 3 - 6 /"+ " = " + result1);

    }
}