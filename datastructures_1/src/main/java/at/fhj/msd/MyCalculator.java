package at.fhj.msd;

public class MyCalculator {

    public static double evaluate(String expr) {
        String[] tokens = expr.trim().split(" ");
        MySinglyLinkedList<String> stack = new MySinglyLinkedList<>();

        // Von rechts nach links durchgehen
        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];

            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                double a = Double.parseDouble(stack.removeFirst());
                double b = Double.parseDouble(stack.removeFirst());

                double result = 0;
                if (token.equals("+")) result = a + b;
                if (token.equals("-")) result = a - b;
                if (token.equals("*")) result = a * b;
                if (token.equals("/")) result = a / b;

                stack.addFirst(String.valueOf(result));
            } else {
                // Zahl -> auf den Stack legen
                stack.addFirst(token);
            }
        }

        return Double.parseDouble(stack.removeFirst());
    }
}
