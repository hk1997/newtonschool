package assignment.string.arrays;

public class findLongestSubarray {

    int computeSum(int[] arr, int i, int j){
        int sum =0;
        for(int k=i; k<=j;k++)
            sum+=arr[k];
        return sum;
    }

    int findLongestSubarray(int[] arr, int k){
        int n = arr.length;
        int maxLen = 0;

        for(int i=0; i<n;i++){ // lower index of subarray
            for(int j=i; j<n; j++){ // higher index of subarray
                int subArraySum = computeSum(arr, i, j); // O(n) time
                if(subArraySum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
        // Time complexity : O(n^3)
        // Space complexity: O(1)
    }

    int findLongestSubarrayApproach2(int[] arr, int k){
        int n = arr.length;
        int maxLen = 0;

        for(int i=0; i<n;i++){ // lower index of subarray
            int sum = 0 ;
            for(int j=i; j<n; j++){ // higher index of subarray

                sum+= arr[j];
                if(sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
        // O(n^2) time
        //  O(1)
    }



}
