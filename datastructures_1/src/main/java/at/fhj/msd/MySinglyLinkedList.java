package at.fhj.msd;

public class MySinglyLinkedList<E> {
  private Node<E> head;
  private int size;

  private static class Node<E> {
    E data;
    Node<E> next;

    public Node(E data, Node<E> next) {
      this.data = data;
      this.next = next;
    }
  }

  public MySinglyLinkedList() {
    head = null;
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public E first() {
    if (isEmpty())
      return null;
    return head.data;
  }

  public void addFirst(E element) {
    if (element == null)
      throw new IllegalArgumentException("Element cannot be null");
    head = new Node<>(element, head);
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
