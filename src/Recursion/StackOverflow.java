package Recursion;

public class StackOverflow {


    static void  fun1(){
        fun1();
    }

    public static void main(String[] args) {
        fun1();
    }
}
