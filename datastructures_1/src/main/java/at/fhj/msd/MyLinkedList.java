package at.fhj.msd;

public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    private static class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;

        Node(E data) {
            this.data = data;
        }
    }

    public MyLinkedList() {
        head = null;
        tail = null;
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

    public E last() {
        if (isEmpty()) return null;
        return tail.data;
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        E data = head.data;
        if (head.next != null) {
            head = head.next;
            head.prev = null;
        } else {
            head = tail = null;
        }
        size--;
        return data;
    }

    public E removeLast() {
        if (isEmpty()) return null;
        E data = tail.data;
        if (tail.prev != null) {
            tail = tail.prev;
            tail.next = null;
        } else {
            head = tail = null;
        }
        size--;
        return data;
    }
}
