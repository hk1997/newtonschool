package strings;

public class ReverseString {

    public static void main(String[] args) {
        String s = "abcdef";
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(rev);
    }
}
