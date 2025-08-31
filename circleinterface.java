import java.util.Scanner;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    double radius;
    Circle(double r) {
        radius = r;
    }
    public double area() {
        return 3.14 * radius * radius;
    }
    public double perimeter() {
        return 2 * 3.14 * radius;
    }
}

class Rectangle implements Shape {
    double length, width;
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    public double area() {
        return length * width;
    }
    public double perimeter() {
        return 2 * (length + width);
    }
}

class Triangle implements Shape {
    double a, b, c;
    Triangle(double x, double y, double z) {
        a = x;
        b = y;
        c = z;
    }
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public double perimeter() {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter radius of circle: ");
            double r = sc.nextDouble();
            Shape c = new Circle(r);
            System.out.println("Circle Area: " + c.area());
            System.out.println("Circle Perimeter: " + c.perimeter());

            System.out.print("Enter length and width of rectangle: ");
            double l = sc.nextDouble();
            double w = sc.nextDouble();
            Shape rect = new Rectangle(l, w);
            System.out.println("Rectangle Area: " + rect.area());
            System.out.println("Rectangle Perimeter: " + rect.perimeter());

            System.out.print("Enter 3 sides of triangle: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c1 = sc.nextDouble();
            Shape t = new Triangle(a, b, c1);
            System.out.println("Triangle Area: " + t.area());
            System.out.println("Triangle Perimeter: " + t.perimeter());
        } catch (Exception e) {
            System.out.println("Invalid input: " + e);
        }
    }
}
