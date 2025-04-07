import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class SwapPairsEvaluate {

    @BeforeEach
    public void runMain() {
        Main.main(new String[0]);
    }

    @Test
    public void testEmpty() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.makeEmpty();
        dll.swapPairs();
        assertEquals(0, dll.getLength());
        assertNull(dll.getHead());
    }

    @Test
    public void testOneNode() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.swapPairs();
        assertEquals(1, dll.getHead().value);
        assertNull(dll.getHead().prev);
    }

    @Test
    public void testTwoNodes() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);
        dll.swapPairs();
        assertEquals(2, dll.getHead().value);
        assertNull(dll.getHead().prev);
        assertEquals(1, dll.getHead().next.value);
        assertEquals(2, dll.getHead().next.prev.value);
    }

    @Test
    public void testThreeNodes() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);
        dll.append(3);
        dll.swapPairs();
        assertEquals(2, dll.getHead().value);
        assertNull(dll.getHead().prev);
        assertEquals(1, dll.getHead().next.value);
        assertEquals(2, dll.getHead().next.prev.value);
        assertEquals(3, dll.getHead().next.next.value);
        assertEquals(1, dll.getHead().next.next.prev.value);
    }

    @Test
    public void testFourNodes() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);
        dll.append(3);
        dll.append(4);
        dll.swapPairs();
        assertEquals(2, dll.getHead().value);
        assertNull(dll.getHead().prev);
        assertEquals(1, dll.getHead().next.value);
        assertEquals(2, dll.getHead().next.prev.value);
        assertEquals(4, dll.getHead().next.next.value);
        assertEquals(1, dll.getHead().next.next.prev.value);
        assertEquals(3, dll.getHead().next.next.next.value);
        assertEquals(4, dll.getHead().next.next.next.prev.value);
    }

    @Test
    public void testFiveNodes() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);
        dll.append(3);
        dll.append(4);
        dll.append(5);
        dll.swapPairs();
        assertEquals(2, dll.getHead().value);
        assertNull(dll.getHead().prev);
        assertEquals(1, dll.getHead().next.value);
        assertEquals(2, dll.getHead().next.prev.value);
        assertEquals(4, dll.getHead().next.next.value);
        assertEquals(1, dll.getHead().next.next.prev.value);
        assertEquals(3, dll.getHead().next.next.next.value);
        assertEquals(4, dll.getHead().next.next.next.prev.value);
        assertEquals(5, dll.getHead().next.next.next.next.value);
        assertEquals(3, dll.getHead().next.next.next.next.prev.value);
    }

}
