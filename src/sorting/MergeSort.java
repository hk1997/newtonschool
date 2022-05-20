package sorting;

public class MergeSort {


    static void mergeSortUtil(int[] arr, int low, int high){
        // return condition
        if(low==high)
            return;

        int mid = (low+high)/2;
        mergeSortUtil(arr, low, mid);
        mergeSortUtil(arr, mid+1, high);

        merge(arr, low, mid, high);
    }


    static void merge(int[] arr, int low, int mid, int high){

        // first array would be from low to mid
        // second array to merge would be from mid+1 to high
        int[] temp = new int[high-low+1];
        int curTempIndex = 0;

        int ptr1 = low; // ending index of 1st array is mid
        int ptr2 = mid+1; // ending index of 2nd array is high

        while(ptr1<=mid && ptr2<=high){
            if(arr[ptr1] < arr[ptr2]){
                temp[curTempIndex] = arr[ptr1];
                ptr1++;
                curTempIndex++;
            }
            else{
                temp[curTempIndex] = arr[ptr2];
                ptr2++;
                curTempIndex++;
            }
        }

        while(ptr1<=mid){
            temp[curTempIndex] = arr[ptr1];
            ptr1++;
            curTempIndex++;
        }

        while(ptr2<=high){
            temp[curTempIndex] = arr[ptr2];
            ptr2++;
            curTempIndex++;
        }

        // at this moment the temp array is completely sorted
        // we copy the elements in the arr array
        for(int i=low,k=0; i<=high; i++,k++){
            arr[i] = temp[k];
        }

    }

}
