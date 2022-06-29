package oops.inheritence;

public abstract class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getName(){
        return name;
    }

}
