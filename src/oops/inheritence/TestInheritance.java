package oops.inheritence;

import java.util.*;

public class TestInheritance {
    public static void main(String[] args) {
        Teacher t1= new Teacher(1, "abra cadabra", null, null);

        System.out.println(t1.getName());
        System.out.println(t1.getEmployeeId());

        // Dynamic method dispatch example

        Employee teacherEmployee = new Teacher(2, "DMP teacher", null, null);
        System.out.println(teacherEmployee.getEmployeeId());
        System.out.println(teacherEmployee.getName());

        List<Integer> l = new LinkedList<>();

        Map<Integer, Integer> hm1 = new HashMap<>();
        Map<Integer, Integer> hm2 = new TreeMap<>();


        Shape s = new Square("Square", 4);
        System.out.println(s.getName());
        System.out.println(s.getArea());
        System.out.println(s.getPerimeter());



    }
}
