package at.fhj.msd;

public class MyCalculator {
    private MySinglyLinkedList<Double> stack = new MySinglyLinkedList<>();

    public double evaluate(String expr) {
        for (String token : expr.split(" ")) {
            if (token.equals("+")) {
                double b = stack.removeFirst();
                double a = stack.removeFirst();
                stack.addFirst(a + b);
            } else if (token.equals("-")) {
                double b = stack.removeFirst();
                double a = stack.removeFirst();
                stack.addFirst(a - b);
            } else if (token.equals("*")) {
                double b = stack.removeFirst();
                double a = stack.removeFirst();
                stack.addFirst(a * b);
            } else if (token.equals("/")) {
                double b = stack.removeFirst();
                double a = stack.removeFirst();
                stack.addFirst(a / b);
            } else {
                stack.addFirst(Double.parseDouble(token));
            }
        }
        return stack.removeFirst();
    }
}
