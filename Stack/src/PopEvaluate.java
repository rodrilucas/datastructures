import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class PopEvaluate {

    @BeforeEach
    public void runMain() {
        Main.main(new String[0]);
    }

    @Test
    public void testPopFromEmptyStack() {
        StackArrayList<Integer> stack = new StackArrayList<>();
        Integer poppedValue = stack.pop();
        assertNull(poppedValue);
        assertEquals(0, stack.size());
    }

    @Test
    public void testPopFromSingleElementStack() {
        StackArrayList<Integer> stack = new StackArrayList<>();
        stack.push(1);
        Integer poppedValue = stack.pop();
        assertEquals(Integer.valueOf(1), poppedValue);
        assertEquals(0, stack.size());
    }

    @Test
    public void testPopFromMultiElementStack() {
        StackArrayList<Integer> stack = new StackArrayList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Integer poppedValue = stack.pop();
        assertEquals(Integer.valueOf(3), poppedValue);
        assertEquals(2, stack.size());
        assertEquals(Integer.valueOf(2), stack.peek());
    }

}