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

    
  }
}