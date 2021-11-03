package Main;

public class Circle extends GeoPrimitive {
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    public String toString() {
        return "\n" + " Circle{" +
                "Perimeter=" + perimeter() +
                ", Area =" + area() + '}';
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}
