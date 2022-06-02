package basics;

import java.util.Scanner;

public class InputString {
    /**
     * when to use next() vs nextLine()
     * Suppose you need to take 3 space separated strings
     * a b c // s1="a" s2="b" s3="c" // use next
     *
     * a b c // s= "a b c" // use nextLine
     *
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1= sc.nextLine();
        String s2 = sc.next();
        String s3= sc.next();
        String s4= sc.next();;
        System.out.println("printing s1 "+s1);
        System.out.println("printing s2 "+s2);
        System.out.println("printing s3 "+s3);
        System.out.println("printing s4 "+s4);
    }
}
