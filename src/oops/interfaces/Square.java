package oops.interfaces;

public class Square implements Shape{

    private double length;

    public Square(double l){
        length = l;
    }

    public double getArea() {
        return length*length;
    }

    public double getPerimeter() {
        return 4*length;
    }

    public double getLength(){
        return length;
    }
}
