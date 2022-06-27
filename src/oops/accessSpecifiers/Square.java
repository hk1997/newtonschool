package oops.accessSpecifiers;

public class Square {
    private String shapeType;
    private double edgeLength;

    public Square(double d){
        edgeLength = d;
    }

    public double area(){
        return edgeLength*edgeLength;
    }

    public double perimeter(){
        return 4*edgeLength;
    }

    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    public double getEdgeLength(){
        return this.edgeLength;
    }

    public String getShapeType() {
        return shapeType;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }
}
