package Main;

public class Diamond extends GeoPrimitive {
    private final double width, height, s1;

    public Diamond(double width, double height, double s1) {
        this.width = width;
        this.height = height;
        this.s1 = s1;
    }

    public String toString() {
        return "\n" + " Diamond{" +
                "Perimeter=" + perimeter() +
                ", Area =" + area() + '}';
    }

    @Override
    public double perimeter() {
        return s1 * 4;
    }

    @Override
    public double area() {
        return width * height;
    }
}
