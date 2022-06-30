package oops.inheritence;

public class Square extends Shape{

    private final double length;

    public Square(String name, double length) {
        super(name);
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*length;
    }

    @Override
    public double getPerimeter() {
        return 4*length;
    }
}
