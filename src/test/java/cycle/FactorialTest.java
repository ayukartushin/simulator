package cycle;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    public void testCalculateFactorialWithSmallNumber() {
        assertEquals(1, Factorial.calculateFactorial(0));
        assertEquals(1, Factorial.calculateFactorial(1));
        assertEquals(2, Factorial.calculateFactorial(2));
        assertEquals(6, Factorial.calculateFactorial(3));
        assertEquals(120, Factorial.calculateFactorial(5));
    }

    @Test
    public void testCalculateFactorialWithLargeNumber() {
        assertEquals(3628800, Factorial.calculateFactorial(10));
    }
}
