import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicatesEvaluate {

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
    public void testRemoveDuplicatesEmptyList() {
        LinkedList ll = new LinkedList(1);
        ll.makeEmpty();
        ll.removeDuplicates();
        assertNull(ll.getHead());
    }

    @Test
    public void testRemoveDuplicatesOneElement() {
        LinkedList ll = new LinkedList(1);
        ll.removeDuplicates();
        assertEquals("1", listToString(ll.getHead()));
    }

    @Test
    public void testRemoveDuplicatesAllUnique() {
        LinkedList ll = new LinkedList(1);
        ll.append(2);
        ll.append(3);
        ll.removeDuplicates();
        assertEquals("1->2->3", listToString(ll.getHead()));
    }

    @Test
    public void testRemoveDuplicatesSomeDuplicates() {
        LinkedList ll = new LinkedList(1);
        ll.append(2);
        ll.append(2);
        ll.append(3);
        ll.removeDuplicates();
        assertEquals("1->2->3", listToString(ll.getHead()));
    }

    @Test
    public void testRemoveDuplicatesAllDuplicates() {
        LinkedList ll = new LinkedList(1);
        ll.append(1);
        ll.append(1);
        ll.removeDuplicates();
        assertEquals("1", listToString(ll.getHead()));
    }

    @Test
    public void testRemoveDuplicatesUpdatesLength() {
        LinkedList ll = new LinkedList(1);
        ll.append(1);
        ll.append(1);
        ll.removeDuplicates();
        assertEquals(ll.getLength(), 1);
        assertEquals("1", listToString(ll.getHead()));
    }

}
