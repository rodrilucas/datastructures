import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class ReverseStringEvaluate {

    @BeforeEach
    public void runMain() {
        Main.main(new String[0]);
    }

    StackArrayList<Object> stack = new StackArrayList<>();

    @Test
    public void testReverseEmptyString() {
        assertEquals("", stack.reverseString(""));
    }

    @Test
    public void testReverseSingleCharString() {
        assertEquals("a", stack.reverseString("a"));
    }

    @Test
    public void testReverseTwoCharString() {
        assertEquals("ba", stack.reverseString("ab"));
    }

    @Test
    public void testReverseMultiCharString() {
        assertEquals("edcba", stack.reverseString("abcde"));
    }

}