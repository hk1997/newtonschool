package sorting;

public class QuickSort {

    static void quickSort(int[] arr, int low, int high){
        if(low>high)
            return;
        int partitionIndex = partition(arr, low, high); // 4
        quickSort(arr, low, partitionIndex-1);
        quickSort(arr, partitionIndex+1, high);
    }

    static int partition(int[] arr, int low, int high){
        // let's have pivot to be the last element of the array
        int pivotElementIndex = high;
        int pivot = arr[pivotElementIndex];

        int curIndex = low;

        for(int i=low; i<=high; i++){
            if(arr[i] < pivot){
                swap(arr, i, curIndex);
                curIndex++;
            }
        }
        // swap pivot with curIndex
        swap(arr, curIndex, pivotElementIndex); // swa
        return curIndex;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
