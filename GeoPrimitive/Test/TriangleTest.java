package Test;

import Main.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    Triangle triangle = new Triangle(2, 4, 5, 3, 10);

    @Test
    void perimeter() {
        double actual = triangle.perimeter();
        assertEquals(11, actual);
    }

    @Test
    void area() {
        double actual = triangle.area();
        assertEquals(15, actual);
    }
}