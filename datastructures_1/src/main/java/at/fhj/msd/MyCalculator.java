package at.fhj.msd;

import java.util.Stack;

public class MyCalculator {

  public static int evaluate(String expression) {
    Stack<Integer> stack = new Stack<>();

    for (String token : expression.split(" ")) {
      switch (token) {
        case "+":
          stack.push(stack.pop() + stack.pop());
          break;
        case "-":
          int b = stack.pop();
          int a = stack.pop();
          stack.push(a - b);
          break;
        case "*":
          stack.push(stack.pop() * stack.pop());
          break;
        case "/":
          int divisor = stack.pop();
          int dividend = stack.pop();
          stack.push(dividend / divisor);
          break;
        default:
          stack.push(Integer.parseInt(token));
      }
    }

    return stack.pop();
  }

  public static void main(String[] args) {
    String expression = "5 1 2 + 4 * + 3 -";  
    int result = evaluate(expression);
    System.out.println("Result: " + result);
  }
}
