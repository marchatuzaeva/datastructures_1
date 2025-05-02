package at.fhj.msd;

public class MySinglyLinkedList {
  Node head;

  public MySinglyLinkedList(Node head) {
    this.head = head;
  }
}

class Node {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;

  }
}
