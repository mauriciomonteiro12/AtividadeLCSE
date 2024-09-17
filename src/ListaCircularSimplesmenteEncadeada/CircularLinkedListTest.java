package ListaCircularSimplesmenteEncadeada;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CircularLinkedListTest {

    private CircularLinkedList list;

    @BeforeEach
    public void setUp() {
        list = new CircularLinkedList();
    }

    @Test
    public void testAddAndDisplay() {
        list.add(10);
        list.add(20);
        list.add(30);
        assertEquals("10 20 30", list.display());
    }

    @Test
    public void testRemoveHead() {
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(10);
        assertEquals("20 30", list.display());
    }

    @Test
    public void testRemoveMiddle() {
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(20);
        assertEquals("10 30", list.display());
    }

    @Test
    public void testRemoveTail() {
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(30);
        assertEquals("10 20", list.display());
    }

    @Test
    public void testRemoveFromEmptyList() {
        list.remove(10);
        assertEquals("A lista está vazia.", list.display());
    }
}