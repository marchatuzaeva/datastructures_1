package at.fhj.msd;

public class App {
    public static void main(String[] args) {
        String expression = "+ 3 4"; // Beispiel: ergibt 7
        double result = MyCalculator.evaluate(expression);
        System.out.println("Ergebnis: " + result);
    }
}
