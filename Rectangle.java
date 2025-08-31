import java.util.Scanner;

public class Rectangle{
    int l;
    int b;

    public Rectangle(int len, int breadth)
    {
        l = len;
        b = breadth;
    }
    double area()
    {
        return l*b;
    }
    double perimeter()
    {
        return 2*(l+b);
    }
    public static void main(String args[])
    {
        Rectangle r = new Rectangle(2,3);
        double ar = r.area();
        double peri = r.perimeter();

        System.out.println("Area: " + ar);
        System.out.println("Perimeter: " + peri);
    }
}