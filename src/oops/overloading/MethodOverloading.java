package oops.overloading;

public class MethodOverloading {

    /**
     * In method overloading, we use the same name for a function but with different parameter list.
     * Please Note: Return type is of no significance, the parameter list should be different.
     */

    /**
     * Our task is to write functions with the following variations:
     * 1. Take one string as input and print it
     * 2. Take two strings as input and print them with a " "
     * 3. Take three strings as input and print them with a "_"
     */
    void printStrings(String s){
        System.out.println(s);
    }

    void  printStrings(String s1, String s2){
        System.out.println(s1+" "+s2);
    }

    void printStrings(String s1, String s2, String s3){
        System.out.println(s1+"_"+s2+"_"+s3);
    }

}
