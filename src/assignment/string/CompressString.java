package assignment.string;

public class CompressString {


    // input is string
    // string

    /**
     *
     * 2 strings: s1 and s2
     * s1+s2 // time complexity for this is O(n2)
     *
     * for this use stringbuilder, it will give better performance
     */

    static String compressString(String s){
            // sanity checks
        if(s==null)
            return null;

        /**
         *  We need to keep track of character and we need to keep track of count
         */
        int n = s.length();
        char curChar = s.charAt(0);
        int curCount = 1;
        StringBuilder ans = new StringBuilder(); // sb

        for(int i=1; i<n; i++){
            if(s.charAt(i) == s.charAt(i-1)){
                curCount++;
            }
            else{
                ans.append(curChar);
                ans.append(curCount);
                curChar = s.charAt(i);
                curCount = 1;
            }
        }

        ans.append(curChar);
        ans.append(curCount);
        return ans.toString();
    }

    public static void main(String[] args) {
        compressString("AAACCCBBD");
    }
}
