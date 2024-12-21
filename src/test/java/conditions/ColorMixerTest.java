package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ColorMixerTest {

    @Test
    public void testMixRedAndBlue() {
        assertEquals("purple", ColorMixer.mixColors("red", "blue"));
        assertEquals("purple", ColorMixer.mixColors("blue", "red"));
    }

    @Test
    public void testMixRedAndYellow() {
        assertEquals("orange", ColorMixer.mixColors("red", "yellow"));
        assertEquals("orange", ColorMixer.mixColors("yellow", "red"));
    }

    @Test
    public void testMixBlueAndYellow() {
        assertEquals("green", ColorMixer.mixColors("blue", "yellow"));
        assertEquals("green", ColorMixer.mixColors("yellow", "blue"));
    }

    @Test
    public void testSameColors() {
        assertEquals("red", ColorMixer.mixColors("red", "red"));
        assertEquals("blue", ColorMixer.mixColors("blue", "blue"));
        assertEquals("yellow", ColorMixer.mixColors("yellow", "yellow"));
    }

    @Test
    public void testUnknownColor() {
        assertEquals("Unknown color", ColorMixer.mixColors("red", "green"));
        assertEquals("Unknown color", ColorMixer.mixColors("purple", "blue"));
        assertEquals("Unknown color", ColorMixer.mixColors("orange", "yellow"));
    }
}
