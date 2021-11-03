package Main;

public class Square extends GeoPrimitive {
    private final double size;

    public Square(double size) {
        this.size = size;
    }

    public String toString() {
        return "\n" + " Square{" +
                "Perimeter=" + perimeter() +
                ", Area =" + area() + '}';
    }

    @Override
    public double perimeter() {
        return size * 4;
    }

    @Override
    public double area() {
        return size * size;
    }
}
