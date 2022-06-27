package oops.interfaces;

public class Rectangle implements Shape{

    private double length, breadth;

    public Rectangle(double l, double b){
        length = l;
        breadth = b;
    }

    public double getArea() {
        return length*breadth;
    }

    public double getPerimeter() {
        return 2*(length+breadth);
    }
}
