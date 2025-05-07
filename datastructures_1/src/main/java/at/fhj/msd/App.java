package at.fhj.msd;

public class App {
    public static void main(String[] args) {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();

        System.out.println("Test: Leere Liste");
        System.out.println("isEmpty(): " + list.isEmpty()); // true
        System.out.println("size(): " + list.size());       // 0
        System.out.println("first(): " + list.first());     // null
        System.out.println("removeFirst(): " + list.removeFirst()); // null

        System.out.println("\nTest: Elemente hinzufügen");
        list.addFirst("C");
        list.addFirst("B");
        list.addFirst("A");

        System.out.println("isEmpty(): " + list.isEmpty()); // false
        System.out.println("size(): " + list.size());       // 3
        System.out.println("first(): " + list.first());     // A

        System.out.println("\nTest: Elemente entfernen");
        System.out.println("removeFirst(): " + list.removeFirst()); // A
        System.out.println("removeFirst(): " + list.removeFirst()); // B
        System.out.println("removeFirst(): " + list.removeFirst()); // C
        System.out.println("removeFirst(): " + list.removeFirst()); // null
        System.out.println("isEmpty(): " + list.isEmpty());         // true
        System.out.println("size(): " + list.size());               // 0
        MyCalculator calc = new MyCalculator();
System.out.println(calc.evaluate("5 1 2 + 4 * + 3 -")); // ergibt 14

    }
}
