package Test;

import Main.Trapezium;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrapeziumTest {
    Trapezium trapezium = new Trapezium(3, 5, 4, 6, 13);

    void perimeter() {
        double actual = trapezium.perimeter();
        assertEquals(27, actual);
    }

    @Test
    void area() {
        double actual = trapezium.area();
        assertEquals(16, actual);
    }
}