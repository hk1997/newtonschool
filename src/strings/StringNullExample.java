package strings;

public class StringNullExample {
    public static void main(String[] args) {
        String s = null;
        String s2 = new String();

        if(s==null){
            System.out.println("String is null");
        }
        else{
            System.out.println("String is not null");
        }

        if(s2==null){
            System.out.println("String s2 is null");
        }
        else{
            System.out.println("String s2 is not null");
        }
    }
}
