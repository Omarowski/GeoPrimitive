package Main;

public class Triangle extends GeoPrimitive {
    private final double a, b, c, base, height;

    public Triangle(double a, double b, double c, double base, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.height = height;
    }

    public String toString() {
        return "\n" + " Triangle{" +
                "Perimeter=" + perimeter() +
                ", Area =" + area() + '}';
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }
}
