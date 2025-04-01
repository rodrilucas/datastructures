import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class ReverseBetweenEvaluate {

    @BeforeEach
    public void runMain() {
        Main.main(new String[0]);
    }

    public String listToString(Node head) {
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            sb.append(temp.value);
            temp = temp.next;
            if (temp != null) sb.append("->");
        }
        return sb.toString();
    }

    @Test
    public void testReverseBetweenEmptyList() {
        LinkedList ll = new LinkedList(1);
        ll.makeEmpty();
        ll.reverseBetween(0, 1);
        assertNull(ll.getHead());
    }

    @Test
    public void testReverseBetweenOneElement() {
        LinkedList ll = new LinkedList(1);
        ll.reverseBetween(0, 0);
        assertEquals("1", listToString(ll.getHead()));
    }

    @Test
    public void testReverseBetweenAllElements() {
        LinkedList ll = new LinkedList(1);
        ll.append(2);
        ll.append(3);
        ll.reverseBetween(0, 2);
        assertEquals("3->2->1", listToString(ll.getHead()));
    }

    @Test
    public void testReverseBetweenPartialList() {
        LinkedList ll = new LinkedList(1);
        ll.append(2);
        ll.append(3);
        ll.reverseBetween(1, 2);
        assertEquals("1->3->2", listToString(ll.getHead()));
    }

    @Test
    public void testReverseBetweenSingleSwap() {
        LinkedList ll = new LinkedList(1);
        ll.append(2);
        ll.reverseBetween(0, 1);
        assertEquals("2->1", listToString(ll.getHead()));
    }

}
