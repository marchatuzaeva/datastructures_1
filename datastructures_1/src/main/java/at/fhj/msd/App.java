package at.fhj.msd;
public class App {
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();

        // Test 1
        String postfix1 = "2 3 + 1 4 + *";
        int result1 = calculator.compute(postfix1);
        System.out.println("Test 1: " + postfix1 + " = " + result1);  // Expected: 14

        // Test 2
        String postfix2 = "5 1 2 + 4 * + 3 -";
        int result2 = calculator.compute(postfix2);
        System.out.println("Test 2: " + postfix2 + " = " + result2);  // Expected: 14

        // Test 3
        String postfix3 = "3 4 + 2 * 7 /";
        int result3 = calculator.compute(postfix3);
        System.out.println("Test 3: " + postfix3 + " = " + result3);  // Expected: 2

        // Test 4
        String postfix4 = "6 2 / 3 +";
        int result4 = calculator.compute(postfix4);
        System.out.println("Test 4: " + postfix4 + " = " + result4);  // Expected: 6

        // Test 5
        String postfix5 = "3 3 +";
        int result5 = calculator.compute(postfix5);
        System.out.println("Test 5: " + postfix5 + " = " + result5);  // Expected: 6
    }
}
