package Main;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle(3, 4);
        Square square = new Square(2);
        Circle circle = new Circle(2);
        Diamond diamond = new Diamond(3, 4, 6);
        Parallelogram parallelogram = new Parallelogram(3, 5, 4, 8);
        Triangle triangle = new Triangle(23, 4, 5, 6, 7);
        Trapezium trapezium = new Trapezium(6, 7, 8, 9, 35);

        ArrayList<GeoPrimitive> geoPrimitives = new ArrayList<GeoPrimitive>();

        geoPrimitives.add(rectangle);
        geoPrimitives.add(square);
        geoPrimitives.add(circle);
        geoPrimitives.add(diamond);
        geoPrimitives.add(parallelogram);
        geoPrimitives.add(triangle);
        geoPrimitives.add(trapezium);


        double totArea = 0;

        for (int i = 0; i < geoPrimitives.size(); i++) {
            GeoPrimitive tot = geoPrimitives.get(i);
            double sumA = tot.area();
            totArea = totArea + sumA;
            System.out.print(geoPrimitives.get(i));
        }
        double totPerimeter = 0;

        for (int j = 0; j < geoPrimitives.size(); j++) {
            GeoPrimitive tot = geoPrimitives.get(j);
            double sumP = tot.perimeter();
            totPerimeter = totPerimeter + sumP;
        }

        System.out.println("\n " + "The total amount of the Area is : " + totArea + "\n " + "The total amount of the Perimeter is :" + totPerimeter);
        System.out.println("The sum of Areas and Perimeters is: " + (totArea + totPerimeter));
    }


}
