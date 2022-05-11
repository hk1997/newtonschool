package strings;

import java.util.Scanner;

public class StringUsingUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if(s1==s2){
            System.out.println("Strings references are equal");
        }
        else{
            System.out.println("Strings references are not equal");
        }

        // compare content we will use equals function
        if(s1.equals(s2)){
            System.out.println("Content of strings is equal.");
        }
        else{
            System.out.println("Content of string is not equal.");
        }

    }
}
