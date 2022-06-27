package oops.interfaces;

import java.util.LinkedList;

public class InterfacesTesting {
    public static void main(String[] args) {
        /**
         * You can store objects of classes implementing the interface in interface variables.
         * Only methods defined in the interfaces will be visible.
         */
        Shape sq = new Square(4);
        Shape rect = new Rectangle(2,3);

        System.out.println(sq.getArea());
        System.out.println(sq.getPerimeter());

        System.out.println(rect.getPerimeter());
        System.out.println(rect.getArea());
    }
}
