package at.fhj.msd;

public class App {
    public static void main(String[] args) {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();

        System.out.println("Ist die Liste leer? " + list.isEmpty()); // true
        System.out.println("Größe der Liste: " + list.size());       // 0

        list.addFirst("Erstes Element");
        list.addFirst("Zweites Element");
        list.addFirst("Drittes Element");

        System.out.println("Ist die Liste leer? " + list.isEmpty()); // false
        System.out.println("Größe der Liste: " + list.size());       // 3

        String entfernt = list.removeFirst();
        System.out.println("Entferntes Element: " + entfernt);       // Drittes Element
        System.out.println("Größe nach Entfernen: " + list.size());  // 2

        entfernt = list.removeFirst();
        System.out.println("Entferntes Element: " + entfernt);       // Zweites Element
        entfernt = list.removeFirst();
        System.out.println("Entferntes Element: " + entfernt);       // Erstes Element
        entfernt = list.removeFirst();
        System.out.println("Entferntes Element: " + entfernt);       // null
    }
}
