package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CardClassifierTest {

    @Test
    public void testNumericCards() {
        assertEquals("Two of Hearts", CardClassifier.classifyCard("2", "H"));
        assertEquals("Ten of Diamonds", CardClassifier.classifyCard("10", "D"));
        assertEquals("Five of Clubs", CardClassifier.classifyCard("5", "C"));
    }

    @Test
    public void testFaceCards() {
        assertEquals("Jack of Spades", CardClassifier.classifyCard("J", "S"));
        assertEquals("Queen of Hearts", CardClassifier.classifyCard("Q", "H"));
        assertEquals("King of Diamonds", CardClassifier.classifyCard("K", "D"));
    }

    @Test
    public void testAces() {
        assertEquals("Ace of Hearts", CardClassifier.classifyCard("A", "H"));
        assertEquals("Ace of Diamonds", CardClassifier.classifyCard("A", "D"));
        assertEquals("Ace of Clubs", CardClassifier.classifyCard("A", "C"));
        assertEquals("Ace of Spades", CardClassifier.classifyCard("A", "S"));
    }

    @Test
    public void testInvalidRanks() {
        assertEquals("Invalid card", CardClassifier.classifyCard("1", "H"));
        assertEquals("Invalid card", CardClassifier.classifyCard("11", "H"));
        assertEquals("Invalid card", CardClassifier.classifyCard("B", "H"));
    }

    @Test
    public void testInvalidSuits() {
        assertEquals("Invalid card", CardClassifier.classifyCard("A", "X"));
        assertEquals("Invalid card", CardClassifier.classifyCard("10", "B"));
        assertEquals("Invalid card", CardClassifier.classifyCard("K", ""));
    }
}
