package Main;

public class Parallelogram extends GeoPrimitive {
    private final double a, b, height, breadth;

    public Parallelogram(double a, double b, double height, double breadth) {
        this.a = a;
        this.b = b;
        this.height = height;
        this.breadth = breadth;
    }

    public String toString() {
        return "\n" + " Parallelogram{" +
                "Perimeter=" + perimeter() +
                ", Area =" + area() + '}';
    }

    @Override
    public double perimeter() {
        return (a + b) * 2;
    }

    @Override
    public double area() {
        return height * breadth;
    }
}
