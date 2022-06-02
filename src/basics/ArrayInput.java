package basics;

import java.util.Scanner;

public class ArrayInput {
    /**
     * Suppose you are given an integer n, and n space separated integers. Take an array as input of size n
     * 5
     * 1 2 3 4 5
     */
    /**
     * Given an integer n, take n space separated strings as input and store them in a string array of size n
     *  4
     *  abc bda bfr awe
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //n = 5
        int[] arr = new int[n]; // [ _  _ _ _ _ ]
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt(); //
        }
    }
}
