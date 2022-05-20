package sorting;

public class BubbleSort {

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void bubbleSort(int[] arr){
        // verify input is right
        if(arr==null || arr.length <=1)
            return;

        int n = arr.length;

        for(int i=0; i<n;i++){
            for(int j=0; j< n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }

    /**
     * Time complexity: O(n^2)
     * Space complexity: O(1)
     */


}
