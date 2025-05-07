package at.fhj.msd;

public class MyLinkedList<E> {
  private static class Node<E> {
    E data;
    Node<E> next;
    Node<E> prev;

    public Node(E data, Node<E> next, Node<E> prev) {
      this.data = data;
      this.next = next;
      this.prev = prev;
    }

    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public int size() {
      return size;
    }

    public boolean isEmpty() {
      if (size == 0) {
        return true;
      } else {
        return false;
      }
    }

    public E first() {
      if (isEmpty()) {
        return null;
      }
      return head.data;
    }

    public E last() {
      if (isEmpty()) {
        return null;
      }
      return tail.data;
    }

    public void addFirst(E element) {
      if (element == null) {
        throw new IllegalArgumentException("Element cannot be null");
      }

      Node<E> newNode = new Node<>(element, head, null); // Neuer Knoten wird erstellt

      if (isEmpty()) {
        tail = newNode; // Liste war leer → head und tail zeigen auf dasselbe
      } else {
        head.prev = newNode; // vorheriger Head bekommt neuen Vorgänger
      }

      head = newNode;
      size++;
    }

    public void addLast(E element) {
      if (element == null) {
        throw new IllegalArgumentException("Element cannot be null");
      }
      Node<E> newNode = new Node<>(element, head, tail); // Neuer Knoten wird erstellt

      if (isEmpty()) {
        tail = newNode; // Liste war leer → head und tail zeigen auf dasselbe
      } else {
        tail.next = newNode; // alter tail zeigt vorwärts auf neuen Node
      }

      tail = newNode; // tail zeigt jetzt auf den neuen letzten Node
      size++;
    }

    public E removeFirst() {
      if (isEmpty()) {
        return null;
      }

      E element = head.data;

      head = head.next; // verschiebe head nach vorne
      if (head != null) {
        head.prev = null;
      } else {
        tail = null; // Liste ist jetzt leer → tail auch null setzen
      }

      size--;
      return element;
    }

    public E removeLast() {
      if (isEmpty()) {
        return null;
      }

      E element = tail.data;
      tail = tail.prev;

      if (tail != null) {
        tail.next = null;
      } else {
        head = null; // Liste ist jetzt leer
      }

      size--;
      return element;
    }
  }
}