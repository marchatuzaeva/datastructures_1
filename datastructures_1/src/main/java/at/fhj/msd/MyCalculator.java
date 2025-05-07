package at.fhj.msd;

public class MyCalculator {
    private MySinglyLinkedList<Double> stack = new MySinglyLinkedList<>();

    public double evaluate(String expr) {
        if (expr == null || expr.trim().isEmpty()) {
            throw new IllegalArgumentException("Input expression is null or empty");
        }

        String[] tokens = expr.trim().split("\\s+");

        for (String token : tokens) {
            switch (token) {
                case "+":
                    checkStackSize();
                    stack.addFirst(stack.removeFirst() + stack.removeFirst());
                    break;
                case "-":
                    checkStackSize();
                    double bSub = stack.removeFirst();
                    double aSub = stack.removeFirst();
                    stack.addFirst(aSub - bSub);
                    break;
                case "*":
                    checkStackSize();
                    stack.addFirst(stack.removeFirst() * stack.removeFirst());
                    break;
                case "/":
                    checkStackSize();
                    double bDiv = stack.removeFirst();
                    double aDiv = stack.removeFirst();
                    if (bDiv == 0.0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    stack.addFirst(aDiv / bDiv);
                    break;
                default:
                    try {
                        double num = Double.parseDouble(token);
                        stack.addFirst(num);
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException("Invalid token: " + token);
                    }
            }
        }

        if (stack.size() != 1) {
            throw new IllegalStateException("Malformed expression");
        }

        return stack.removeFirst();
    }

    private void checkStackSize() {
        if (stack.size() < 2) {
            throw new IllegalStateException("Not enough operands for operation");
        }
    }
}
