import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class BinaryToDecimalEvaluate {

    @BeforeEach
    public void runMain() {
        Main.main(new String[0]);
    }

    @Test
    public void test_1011_To_11() {
        LinkedList list = new LinkedList(1);
        list.append(0);
        list.append(1);
        list.append(1);
        int result = list.binaryToDecimal();
        assertEquals(11, result);
    }

    @Test
    public void test_1100_To_12() {
        LinkedList list = new LinkedList(1);
        list.append(1);
        list.append(0);
        list.append(0);
        int result = list.binaryToDecimal();
        assertEquals(12, result);
    }

    @Test
    public void test_1_To_1() {
        LinkedList list = new LinkedList(1);
        int result = list.binaryToDecimal();
        assertEquals(1, result);
    }

    @Test
    public void test_0_To_0() {
        LinkedList list = new LinkedList(0);
        int result = list.binaryToDecimal();
        assertEquals(0, result);
    }

    @Test
    public void test_EmptyList() {
        LinkedList list = new LinkedList(1); // Initialize with any value
        list.makeEmpty(); // Make it empty
        int result = list.binaryToDecimal();
        assertEquals(0, result);
    }

}