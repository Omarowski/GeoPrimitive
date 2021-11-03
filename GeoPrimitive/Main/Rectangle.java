package Main;

public class Rectangle extends GeoPrimitive {
    private final double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public String toString() {
        return "Rectangle{" +
                "Perimeter=" + perimeter() +
                ", Area =" + area() + '}';
    }

    @Override
    public double perimeter() {
        return length + length + width + width;
    }

    @Override
    public double area() {
        return length * width;
    }
}
