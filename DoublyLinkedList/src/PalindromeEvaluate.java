
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;


public class PalindromeEvaluate {

    @BeforeEach
    public void runMain() {
        Main.main(new String[0]);
    }

    @Test
    public void testEmptyReturnsTrue() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.makeEmpty();
        assertTrue(dll.isPalindrome());
    }

    @Test
    public void testOneNodeTrue() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        assertTrue(dll.isPalindrome());
    }

    @Test
    public void testTwoSameNodesTrue() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(1);
        assertTrue(dll.isPalindrome());
    }

    @Test
    public void testTwoDiffNodesFalse() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);
        assertFalse(dll.isPalindrome());
    }

    @Test
    public void testMultiNodePalindromeTrue() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);
        dll.append(3);
        dll.append(2);
        dll.append(1);
        assertTrue(dll.isPalindrome());
    }

    @Test
    public void testMultiNodeNotPalindromeFalse() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);
        dll.append(3);
        dll.append(4);
        dll.append(5);
        assertFalse(dll.isPalindrome());
    }

    @Test
    public void testEvenNodeNotPalindromeMiddeSameFalse() {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);
        dll.append(3);
        dll.append(4);
        dll.append(2);
        dll.append(1);
        assertFalse(dll.isPalindrome());
    }
}