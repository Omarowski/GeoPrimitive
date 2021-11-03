package Test;

import Main.Parallelogram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParallelogramTest {
    Parallelogram parallelogram = new Parallelogram(3, 4, 5, 4);

    @Test
    void perimeter() {
        double actual = parallelogram.perimeter();
        assertEquals(14, actual);
    }

    @Test
    void area() {
        double actual = parallelogram.area();
        assertEquals(20, actual);
    }
}