package arrays;

public class ArraysDemo {

    /**
     *  return_type function_name(parameters)
     *
     * parameters=> input to the function
     * return_type => output (if there is no output, return type= void
     */

    static void printElements(int[] arr){
        int n = arr.length; // returns the length of the array
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void printCharElements(char[] arr){
        int n = arr.length; // returns the length of the array
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5]; // by default all elements are 0
        printElements(arr);
        arr[2] = 99;
        printElements(arr);
        arr[0]= arr[2];
        printElements(arr);

        int[] arr2 = new int[]{1,2,3,4,5,6};
        System.out.println("For arr 2");
        printElements(arr2);


        char[] charArr = new char[]{'a','b','c','d'};
        System.out.println("Printing character array");
        printCharElements(charArr);
    }
}
