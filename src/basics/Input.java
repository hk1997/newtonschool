package basics;

// mandatory import to use scanner
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // define the scanner object
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        String s = sc.nextLine(); // takes entire line as input
        String s2 = sc.next(); // takes first token of a space separated string a b c d
        // String is an array of characters. To take char as input
        // we will take string as input, and then take the first
        // character from that string
        char c = sc.next().charAt(0);



    }
}
