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

    // Falls die Zahl ist, füge sie in den Stack ein
    if(Character.isDigit(c))

    {
        StringBuilder num = new StringBuilder();
        while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
            num.append(expression.charAt(i));
            i++;
        }
        i--; // Um sicherzustellen, dass die Schleife den richtigen Index beibehält
        stack.addFirst(Integer.parseInt(num.toString()));
    }
    // Wenn der Operator ist, führe die Operation aus
    else
    {
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
    return stack.removeFirst();}

  private int applyOperator(int a, int b, String operator) {
      switch (operator) {
          case "+": return a + b;
          case "-": return a - b;
          case "*": return a * b;
          case "/": return a / b;
          default: throw new IllegalArgumentException("Unknown operator: " + operator);
      }
  }