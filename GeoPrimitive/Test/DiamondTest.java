package Test;

import Main.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiamondTest {

    Diamond diamond = new Diamond(1, 2, 3);

    @Test
    void perimeter() {
        double actual = diamond.perimeter();
        assertEquals(12, actual);
    }

    @Test
    void area() {
        double actual = diamond.area();
        assertEquals(2, actual);
    }
}