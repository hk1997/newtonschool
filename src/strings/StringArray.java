package strings;

public class StringArray {

    static void printArrayElements(String[] arr){
        for(int i=0; i< arr.length; i++){
            if(arr[i]==null){
                System.out.println("String at index "+i+" is null");
            }
            else{
                System.out.println("String at index "+i+" is not null and its value is "+arr[i]);
            }
        }
    }

    public static void main(String[] args) {

        String[] arr = new String[5];

        printArrayElements(arr);

        arr[0] = new String("Hardik");
        arr[4]= new String("Hello world!");

        System.out.println("Updated array");
        printArrayElements(arr);


    }
}
