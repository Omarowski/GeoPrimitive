package Test;

import Main.Parallelogram;
import Main.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    Rectangle rectangle = new Rectangle(3, 4);

    @Test
    void perimeter() {
        double actual = rectangle.perimeter();
        assertEquals(14, actual);
    }

    @Test
    void area() {
        double actual = rectangle.area();
        assertEquals(12, actual);
    }
}