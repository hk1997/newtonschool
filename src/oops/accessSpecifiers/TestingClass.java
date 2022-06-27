package oops.accessSpecifiers;

public class TestingClass {
    public static void main(String[] args) {
        Square sq = new Square(4);
        Square sq2 = new Square(6);

        System.out.println(sq.area());
        System.out.println(sq2.area());
    }

}
