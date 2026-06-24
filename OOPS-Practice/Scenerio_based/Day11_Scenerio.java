package oops_practice.Scenerio_based;

abstract class Shape {

    abstract double area();

    abstract double perimeter();
}

class Circle extends Shape {

    // Immutable radius
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Getter only
    public double getRadius() {
        return radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {

    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {

    private double side1, side2, side3;

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double area() {
        double s = perimeter() / 2; // semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    double perimeter() {
        return side1 + side2 + side3;
    }
}

public class Day11_Scenerio {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[5];

        shapes[0] = new Circle(7);
        shapes[1] = new Rectangle(10, 5);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new Circle(4);
        shapes[4] = new Rectangle(8, 6);

        System.out.println("==============================================");
        System.out.printf("%-15s %-15s %-15s%n",
                "Shape", "Area", "Perimeter");
        System.out.println("==============================================");

        for (Shape s : shapes) {

            System.out.printf("%-15s %-15.2f %-15.2f%n",
                    s.getClass().getSimpleName(),
                    s.area(),
                    s.perimeter());
        }

        System.out.println("==============================================");
    }
}