package at.fhj.msd;

public class MyCalculator {

    public int compute(String expression) {
        MySinglyLinkedList<Integer> stack = new MySinglyLinkedList<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isOperator(token)) {
                int b = stack.removeFirst();
                int a = stack.removeFirst();
                int result = applyOperator(a, b, token);
                stack.addFirst(result);
            } else {
                stack.addFirst(Integer.parseInt(token));
            }
        }
        return stack.first(); // Das Ergebnis sollte sich am Anfang der Liste befinden
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private int applyOperator(int a, int b, String operator) {
        switch (operator) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            default: throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }
}
