package at.fhj.msd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MySinglyLinkedListTest {

    @Test

    public void testIsEmptyOnNewList() {

        MySinglyLinkedList<Integer> list = new MySinglyLinkedList<>();

        assertTrue(list.isEmpty());

    }

    @Test

    public void testAddFirst() {

        MySinglyLinkedList<Integer> list = new MySinglyLinkedList<>();

        list.addFirst(10);

        assertFalse(list.isEmpty());

        assertEquals(1, list.size());

        assertEquals(10, list.first());

    }

    @Test

    public void testRemoveFirst() {

        MySinglyLinkedList<Integer> list = new MySinglyLinkedList<>();

        list.addFirst(10);

        list.addFirst(20);

        assertEquals(20, list.removeFirst());

        assertEquals(1, list.size());

        assertEquals(10, list.first());

    }

    @Test

    public void testRemoveFromEmptyList() {

        MySinglyLinkedList<Integer> list = new MySinglyLinkedList<>();

        assertNull(list.removeFirst());

        assertTrue(list.isEmpty());

    }

    @Test

    public void testSizeUpdatesCorrectly() {

        MySinglyLinkedList<Integer> list = new MySinglyLinkedList<>();

        assertEquals(0, list.size());

        list.addFirst(10);

        list.addFirst(20);

        assertEquals(2, list.size());

        list.removeFirst();

        assertEquals(1, list.size());

    }

}
