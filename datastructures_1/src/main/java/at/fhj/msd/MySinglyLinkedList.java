package at.fhj.msd;

public class MySinglyLinkedList<E> {
  private static class Node<E> {
    E data;
    Node<E> next;

    public Node(E data, Node<E> next) {
      this.data = data;
      this.next = next;

    }
  }

  private Node<E> head;
  private int size = 0;

  public MySinglyLinkedList() {
    head = null;
    size = 0;
  }

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


  public void addFirst(E element) {
    if (element == null) {
      throw new IllegalArgumentException("Element cannot be null");
    }

    Node<E> newNode = new Node<>(element, head);
    head = newNode;
    size++;
  }

  public E removeFirst() {
    if (isEmpty())
      return null;
    E temp = head.data;
    head = head.next;
    size--;
    return temp;
  }
}
