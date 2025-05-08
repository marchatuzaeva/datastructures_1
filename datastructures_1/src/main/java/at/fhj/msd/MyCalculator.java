package at.fhj.msd;

public class MyCalculator {

    public static int evaluatePostfix(String expression) {
        MySinglyLinkedList<Integer> stack = new MySinglyLinkedList<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // Ignoriere Leerzeichen
            if (c == ' ') {
                continue;
            }

            // Falls die Zahl ist, füge sie in den Stack ein
            if (Character.isDigit(c)) {
                StringBuilder num = new StringBuilder();
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num.append(expression.charAt(i));
                    i++;
                }
                i--;  // Um sicherzustellen, dass die Schleife den richtigen Index beibehält
                stack.addFirst(Integer.parseInt(num.toString()));
            }
            // Wenn der Operator ist, führe die Operation aus
            else {
                int b = stack.removeFirst();
                int a = stack.removeFirst();

                switch (c) {
                    case '+':
                        stack.addFirst(a + b);
                        break;
                    case '-':
                        stack.addFirst(a - b);
                        break;
                    case '*':
                        stack.addFirst(a * b);
                        break;
                    case '/':
                        stack.addFirst(a / b);
                        break;
                    default:
                        throw new IllegalArgumentException("Unbekannter Operator: " + c);
                }
            }
        }

        // Der letzte Wert im Stack ist das Ergebnis
        return stack.removeFirst();
    }

    public static void main(String[] args) {
        String expression = "3 4 + 2 * 7 /";
        System.out.println("Ergebnis: " + evaluatePostfix(expression));  // Sollte 2 ausgeben
    }
}
