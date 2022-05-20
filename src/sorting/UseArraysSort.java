package sorting;

import java.util.Arrays;
import java.util.Collections;

public class UseArraysSort {


    static void printArray(int[] arr){
        for(Object ob: arr)
            System.out.print(ob+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,5,7,0,3};
        System.out.println("Array before sorting");
        printArray(arr);
        Arrays.sort(arr);
        System.out.println("Array after sorting");
        printArray(arr);
    }
}
