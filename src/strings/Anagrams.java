package strings;

import java.util.Arrays;

public class Anagrams {

    static boolean isAnagramApproach1(String s1, String s2){
        // sanity checks
        if(s1==null || s2==null)
            return false;
        else if(s1.length() != s2.length())
            return false;

        char[] arr1 = s1.toCharArray(); // O(n) time O(n) space
        char[] arr2= s2.toCharArray(); // O(n) time O(n) space

        Arrays.sort(arr1); // O(nlogn) time
        Arrays.sort(arr2); // O(nlogn) time

        // compare elements

        for(int i=0; i<arr1.length; i++){ // O(n) time
            if(arr1[i]!=arr2[i])
                return false;
        }

        return true;
    }

    static boolean isAnagramApproach2(String s1, String s2){
        // sanity checks
        if(s1==null || s2==null)
            return false;
        else if(s1.length() != s2.length())
            return false;
        int n = s1.length();
        int[] countArray1 = new int[26]; // O(1) space
        int[] countArray2 = new int[26]; // O(1) space

        for(int i=0; i<n ;i++){  // O(n) time
            char c1 = s1.charAt(i);
            countArray1[c1-'a']++;

            char c2 = s2.charAt(i);
            countArray2[c2-'a']++;
        }

        // compare 2 arrays
        for(int i=0; i<26;i++){ // O(1) time
            if(countArray1[i]!=countArray2[i])
                return false;
        }

        return true;

    }
}
