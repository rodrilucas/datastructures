import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class FindMiddleEvaluate {

    @BeforeEach
    public void runMain() {
        Main.main(new String[0]);
    }

    @Test
    public void testFindMiddleEmpty() {
        LinkedList ll = new LinkedList(1);
        ll.makeEmpty();  // Make list empty
        assertNull(ll.findMiddleNode());
    }

    @Test
    public void testFindMiddleOneElement() {
        LinkedList ll = new LinkedList(1);
        assertEquals(1, ll.findMiddleNode().value);
    }

    @Test
    public void testFindMiddleOddElements() {
        LinkedList ll = new LinkedList(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);
        assertEquals(3, ll.findMiddleNode().value);
    }

    @Test
    public void testFindMiddleEvenElements() {
        LinkedList ll = new LinkedList(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);
        ll.append(6);
        assertEquals(4, ll.findMiddleNode().value);
    }

}