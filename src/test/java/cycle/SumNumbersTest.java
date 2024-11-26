package cycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SumNumbersTest {

    @Test
    public void testCalculateSumWithSmallNumber() {
        assertEquals(15, SumNumbers.calculateSum(5));
    }

    @Test
    public void testCalculateSumWithZero() {
        assertEquals(0, SumNumbers.calculateSum(0));
    }

    @Test
    public void testCalculateSumWithLargeNumber() {
        assertEquals(5050, SumNumbers.calculateSum(100));
    }
}
