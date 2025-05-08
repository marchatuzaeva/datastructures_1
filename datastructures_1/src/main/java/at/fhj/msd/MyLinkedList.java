package at.fhj.msd;

public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    private static class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;

        public Node(E data, Node<E> next, Node<E> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

   

    public int size() {
        return size;
    }

    public boolean isEmpty() {

        return size == 0;
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

        Node<E> newNode = new Node<>(element, head, null);

        if (isEmpty()) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }

        head = newNode;
        size++;
    }

    public void addLast(E element) {
        if (element == null) {
            throw new IllegalArgumentException("Element cannot be null");
        }

        Node<E> newNode = new Node<>(element, null, tail);

        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }

        tail = newNode;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }

        E element = head.data;

        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
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
            head = null;
        }

        size--;
        return element;
    }
}
