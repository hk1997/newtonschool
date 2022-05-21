package binarysearch;

public class BinarySearch {

    static int binarySearchRecursive(int[] arr, int low, int high, int el){

        /**
         * Time complexity: O(logn)
         * Space complexity: O(logn) stack space
         */

        if(low>high)
            return -1; // indicates element is not in array

        int mid = (low+high)/2;
        if(arr[mid] == el){
            return mid;
        }
        else if(arr[mid] > el){
            return binarySearchRecursive(arr, low, mid-1, el);
        }
        else {
            return binarySearchRecursive(arr, mid+1, high, el);
        }
    }

    static int binarySearchIterative(int[] arr,  int el){
        /**
         * Time complexity: O(logn)
         * Space complexity: O(1)
         */
        int low = 0, high = arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == el){
                return mid;
            }
            else if(arr[mid] > el){
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return -1;
    }


}
