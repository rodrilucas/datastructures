import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class FindKthFromEndEvaluate {

    @BeforeEach
    public void runMain() {
        Main.main(new String[0]);
    }

    @Test
    public void testFindKthFromEndInEmptyListReturnsNull() {
        LinkedList ll = new LinkedList(1);
        ll.makeEmpty();
        assertNull(ll.findKthFromEnd(1));
    }

    @Test
    public void testFindKthFromEndInOneElementList() {
        LinkedList ll = new LinkedList(1);
        assertEquals(1, ll.findKthFromEnd(1).value);
    }

    @Test
    public void testFindKthFromEndInLongerList() {
        LinkedList ll = new LinkedList(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        assertEquals(3, ll.findKthFromEnd(2).value);
    }

    @Test
    public void testFindKthFromEndOutOfBoundsReturnsNull() {
        LinkedList ll = new LinkedList(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        assertNull(ll.findKthFromEnd(5));
    }

}
