package arrays;

public class SwapTwoNumbers {

    static void printElements(int[] arr){
        int n = arr.length; // returns the length of the array
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void swapNumbersInArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int i = 0;
        int j = 3;
        System.out.println("Elements before swapping");
        printElements(arr);
        swapNumbersInArray(arr, i, j);
        System.out.println("Elements after swapping "+i+" & "+j);
        printElements(arr);
    }

}
