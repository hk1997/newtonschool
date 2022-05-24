package hashing;

import java.util.HashSet;

public class SearchStrings {


    static boolean linearSearch(String[] arr, String q){
        for(String s: arr){
            if(s.equals(q))
                return true;
        }
        return false;
    }

    static boolean[] linearSearchFindStrings(String[] arr, String[] queries){

        boolean[] ans = new boolean[queries.length];

        for(int i=0; i<queries.length; i++){
            ans[i] = linearSearch(arr, queries[i]); // O(n) time
        }
        return ans;
    }

    static  boolean[] hashingFindStrings(String[] arr, String[] queries){
        // let's hash the array elements
        HashSet<String> hs = new HashSet<>(); // O(n) space

        // add elements in the hash set
        for(String s: arr)
            hs.add(s);

        boolean[] ans = new boolean[queries.length];

        for(int i=0; i<queries.length; i++){

            if(hs.contains(queries[i])){ // O(1) operation
                ans[i] = true;
            }
            else{
                ans[i]= false;
            }
        }
        return ans;
    }

}
