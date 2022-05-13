package Recursion;

public class FunctionCalls {

    static  void fun1(){
        System.out.println("Starting function f1");
        fun2();
        fun3();
        System.out.println("Ending function f1");
    }

    static  void fun2(){
        System.out.println("Starting function f2");
        fun3();
        System.out.println("Ending function f2");
    }

    static void fun3(){
        System.out.println("Starting function f3");
        System.out.println("Ending function f3");
    }

    public static void main(String[] args) {
        System.out.println("Starting the program with main function");
        System.out.println("Call function f1 from main");
        fun1();
    }
}
