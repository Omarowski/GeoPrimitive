package Test;

import Main.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square square = new Square(4);

    void perimeter() {
        double actual = square.perimeter();
        assertEquals(16, actual);
    }

    @Test
    void area() {
        double actual = square.area();
        assertEquals(16, actual);
    }
}