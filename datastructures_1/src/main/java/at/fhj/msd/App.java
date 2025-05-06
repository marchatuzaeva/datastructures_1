package at.fhj.msd;

public class App {
    public static void main(String[] args) {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();

        System.out.println("Ist die Liste leer? " + list.isEmpty()); 
        System.out.println("Größe der Liste: " + list.size()); 

        list.addFirst("Erstes Element");
        list.addFirst("Zweites Element");
        list.addFirst("Drittes Element");
        list.addFirst("Viertes Element");

        System.out.println("Ist die Liste leer? " + list.isEmpty()); 
        System.out.println("Größe der Liste: " + list.size()); 

        System.out.println("Entferntes Element: " + list.removeFirst()); 
        System.out.println("Größe nach Entfernen: " + list.size()); 

        System.out.println("Entferntes Element: " + list.removeFirst()); 
        System.out.println("Entferntes Element: " + list.removeFirst()); 
        System.out.println("Entferntes Element: " + list.removeFirst()); 
        System.out.println("Erstes Element: " + list.first()); 

    }
}
