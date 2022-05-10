package arrays;

import java.util.Scanner;

public class ArraysUserInput {

    static void printElementsFromLeftToRight(int[] arr){
        int n = arr.length; // returns the length of the array
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number");
        int n = sc.nextInt(); // n=5
        int[] arr = new int[n]; // memory allocated
        for(int i=0; i<n; i++){ // i = 0,1,2,3,4
            System.out.println("Type array element at index:"+i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Printing array elements");

        printElementsFromLeftToRight(arr);

    }
}
