package cycle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {

    @Test
    public void testEmptyString() {
        Assertions.assertEquals("", ReverseString.reverse(""));
    }

    @Test
    public void testSingleCharacter() {
        Assertions.assertEquals("a", ReverseString.reverse("a"));
    }

    @Test
    public void testNormalString() {
        Assertions.assertEquals("cba", ReverseString.reverse("abc"));
    }

    @Test
    public void testPalindrome() {
        Assertions.assertEquals("madam", ReverseString.reverse("madam"));
    }
}