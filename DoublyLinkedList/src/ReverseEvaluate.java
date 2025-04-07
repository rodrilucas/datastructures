import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class ReverseEvaluate {

    @BeforeEach
    public void runMain() {
        Main.main(new String[0]);
    }

    @Test
    public void testEmptyList() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.makeEmpty();
        dll.reverse();
        assertEquals(0, dll.getLength());
    }

    @Test
    public void testSingleNode() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.reverse();
        assertEquals(1, dll.getHead().value);
        assertEquals(1, dll.getTail().value);
    }

    @Test
    public void testTwoNodes() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);
        dll.reverse();

        assertEquals(2, dll.getHead().value);
        assertEquals(1, dll.getTail().value);

        assertNull(dll.getHead().prev);
        assertEquals(1, dll.getHead().next.value);

        assertNull(dll.getTail().next);
        assertEquals(2, dll.getTail().prev.value);
    }

    @Test
    public void testMultipleNodes() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);
        dll.append(3);
        dll.append(4);
        dll.reverse();

        assertEquals(4, dll.getHead().value);
        assertEquals(1, dll.getTail().value);

        assertNull(dll.getHead().prev);
        assertEquals(3, dll.getHead().next.value);

        assertEquals(4, dll.get(1).prev.value);
        assertEquals(2, dll.get(1).next.value);

        assertEquals(3, dll.get(2).prev.value);
        assertEquals(1, dll.get(2).next.value);

        assertEquals(2, dll.getTail().prev.value);
        assertNull(dll.getTail().next);
    }

    @Test
    public void testHeadIsUpdatedCorrectly() {
        DoublyLinkedList list = new DoublyLinkedList(1);
        list.append(2);
        list.append(3);

        list.reverse();

        assertEquals(3, list.getHead().value);
    }

    @Test
    public void testTailIsUpdatedCorrectly() {
        DoublyLinkedList list = new DoublyLinkedList(1);
        list.append(2);
        list.append(3);

        list.reverse();

        assertEquals(1, list.getTail().value);
    }

}