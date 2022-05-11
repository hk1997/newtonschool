package strings;

public class StringBasics {

    /**
     * define some variable
     * data_type variable =
     */

    public static void main(String[] args) {

         String s = new String("Hardik");
         System.out.println(s);
         System.out.println(s.charAt(3)); //

        String s2 = new String("Hardik");

        if(s==s2){
            System.out.println("Strings references are equal");
        }
        else{
            System.out.println("Strings references are not equal");
        }

        // compare content we will use equals function
        if(s.equals(s2)){
            System.out.println("Content of strings is equal.");
        }
        else{
            System.out.println("Content of string is not equal.");
        }

    }
}
