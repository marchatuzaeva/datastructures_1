package at.fhj.msd;

public class MySinglyLinkedList<E> {
  private Node<E> head;
  private int size;

  private static class Node<E> {
      E data;
      Node<E> next;

      Node(E data) {
          this.data = data;
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
      if (isEmpty()) return null;
      return head.data;
  }

  public void addFirst(E e) {
      Node<E> newNode = new Node<>(e);
      newNode.next = head;
      head = newNode;
      size++;
  }

  public E removeFirst() {
      if (isEmpty()) return null;
      E data = head.data;
      head = head.next;
      size--;
      return data;
  }
}
