package at.fhj.msd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {

    @Test
    public void testIsEmptyOnNewList() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testSizeAfterAddingElements() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFirst(10);
        list.addLast(20);
        assertEquals(2, list.size());
    }

    @Test
    public void testAddFirst() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFirst(30);
        assertFalse(list.isEmpty());
        assertEquals(1, list.size());
        assertEquals(30, list.first());
    }

    @Test
    public void testAddLast() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addLast(40);
        assertFalse(list.isEmpty());
        assertEquals(1, list.size());
        assertEquals(40, list.last());
    }

    @Test
    public void testFirstAndLastOnMultipleElements() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFirst(50);
        list.addLast(60);
        assertEquals(50, list.first());
        assertEquals(60, list.last());
    }

    @Test
    public void testRemoveFirst() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFirst(70);
        list.addFirst(80);
        assertEquals(80, list.removeFirst());
        assertEquals(70, list.first());
        assertEquals(1, list.size());
    }

    @Test
    public void testRemoveLast() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addLast(90);
        list.addLast(100);
        assertEquals(100, list.removeLast());
        assertEquals(90, list.last());
        assertEquals(1, list.size());
    }

    @Test
    public void testRemoveUntilEmpty() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFirst(110);
        list.addLast(120);
        list.removeFirst();
        list.removeLast();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }
}
