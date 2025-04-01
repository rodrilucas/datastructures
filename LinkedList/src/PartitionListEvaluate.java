import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import java.util.*;


public class PartitionListEvaluate {

    @BeforeEach
    public void runMain() {
        Main.main(new String[0]);
    }

    @Test
    public void testPartitionListEmptyList() {
        LinkedList ll = new LinkedList(1);
        ll.makeEmpty();
        ll.partitionList(2);
        assertEquals(0, ll.getLength());
        assertNull(ll.getHead());
    }

    @Test
    public void testPartitionListOneElement() {
        LinkedList ll = new LinkedList(1);
        ll.partitionList(1);
        assertEquals(1, ll.getLength());
        assertEquals(1, ll.getHead().value);
    }

    @Test
    public void testPartitionListAllSmaller() {
        LinkedList ll = new LinkedList(1);
        ll.append(2);
        ll.append(3);
        ll.partitionList(5);
        assertEquals(3, ll.getLength());
        assertEquals(1, ll.getHead().value);
        assertEquals(2, ll.getHead().next.value);
        assertEquals(3, ll.getHead().next.next.value);
    }

    @Test
    public void testPartitionListAllGreater() {
        LinkedList ll = new LinkedList(5);
        ll.append(6);
        ll.append(7);
        ll.partitionList(2);
        assertEquals(3, ll.getLength());
        assertEquals(5, ll.getHead().value);
        assertEquals(6, ll.getHead().next.value);
        assertEquals(7, ll.getHead().next.next.value);
    }

    @Test
    public void testPartitionListMixed() {
        LinkedList ll = new LinkedList(3);
        ll.append(1);
        ll.append(4);
        ll.append(2);
        ll.partitionList(3);
        assertEquals(4, ll.getLength());
        assertEquals(1, ll.getHead().value);
        assertEquals(2, ll.getHead().next.value);
        assertEquals(3, ll.getHead().next.next.value);
        assertEquals(4, ll.getHead().next.next.next.value);
    }

}