import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PushEvaluate {

    @BeforeEach
    public void runMain() {
        Main.main(new String[0]);
    }

    @Test
    public void testPushToEmptyStack() {
        StackArrayList<Integer> stack = new StackArrayList<>();
        stack.push(1);
        assertEquals(1, stack.size());
        assertEquals(Integer.valueOf(1), stack.peek());
    }

    @Test
    public void testPushToSingleElementStack() {
        StackArrayList<Object> stack = new StackArrayList<>();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size());
        assertEquals(Integer.valueOf(2), stack.peek());
    }

    @Test
    public void testPushToMultiElementStack() {
        StackArrayList<Object> stack = new StackArrayList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.size());
        assertEquals(Integer.valueOf(3), stack.peek());
    }

}
