package conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TriangleClassifierTest {

    @Test
    public void testEquilateralTriangle() {
        assertEquals("Equilateral", TriangleClassifier.classifyTriangle(5, 5, 5));
        assertEquals("Equilateral", TriangleClassifier.classifyTriangle(3, 3, 3));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Isosceles", TriangleClassifier.classifyTriangle(5, 5, 3));
        assertEquals("Isosceles", TriangleClassifier.classifyTriangle(4, 3, 4));
        assertEquals("Isosceles", TriangleClassifier.classifyTriangle(3, 4, 4));
    }

    @Test
    public void testScaleneTriangle() {
        assertEquals("Scalene", TriangleClassifier.classifyTriangle(3, 4, 5));
        assertEquals("Scalene", TriangleClassifier.classifyTriangle(5, 7, 9));
    }

    @Test
    public void testNotATriangle() {
        assertEquals("Not a triangle", TriangleClassifier.classifyTriangle(1, 1, 3));
        assertEquals("Not a triangle", TriangleClassifier.classifyTriangle(1, 3, 1));
        assertEquals("Not a triangle", TriangleClassifier.classifyTriangle(3, 1, 1));
    }
}
