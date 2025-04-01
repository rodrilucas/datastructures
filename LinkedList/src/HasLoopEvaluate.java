import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class HasLoopEvaluate {

    @BeforeEach
    public void runMain() {
        Main.main(new String[0]);
    }

    @Test
    public void testHasLoopWithEmptyListReturnsFalse() {
        LinkedList ll = new LinkedList(1);
        ll.makeEmpty();
        assertFalse(ll.hasLoop());
    }

    @Test
    public void testHasLoopWithOneElementReturnsFalse() {
        LinkedList ll = new LinkedList(1);
        assertFalse(ll.hasLoop());
    }

    @Test
    public void testHasLoopWithNoLoopReturnsFalse() {
        LinkedList ll = new LinkedList(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        assertFalse(ll.hasLoop());
    }


    public void createPartialLoop(LinkedList list) {
        list.getHead().next.next.next = list.getHead().next;
    }

    @Test
    public void testHasLoopWithLoopReturnsTrue() {
        LinkedList longList = new LinkedList(1);
        for (int i = 2; i <= 8; i++) {
            longList.append(i);
        }

        createPartialLoop(longList);

        LinkedList secondHalf = new LinkedList(5);
        secondHalf.append(6);
        secondHalf.append(7);
        secondHalf.append(8);

        assertTrue(longList.hasLoop());

        assertFalse(secondHalf.hasLoop());
    }

}