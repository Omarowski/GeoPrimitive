package Test;

import Main.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {
    Circle circle = new Circle(2);

    @Test
    void perimeter() {
        double actual = circle.perimeter();
        assertEquals(12.566370614359172, actual);
    }

    @Test
    void area() {
        double actual = circle.area();
        assertEquals(50.26548245743669, actual);

    }
}