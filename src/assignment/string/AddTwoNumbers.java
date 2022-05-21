package assignment.string;

public class AddTwoNumbers {

    static String addTwoNumbers(String s1, String s2){

        if(s1==null || s1.length()==0)
            return s2;
        else if(s2==null || s2.length()==0)
            return s1;

        int n = s1.length();
        int m = s2.length();

        int carry = 0;
        int ptr1 = n-1;
        int ptr2 = m-1;

        StringBuilder ans = new StringBuilder();

        while(ptr1>=0 && ptr2>=0){
            int el1 = s1.charAt(ptr1) - '0';  // '0'-> unicode '3'-> unicode
            int el2 = s2.charAt(ptr2) - '0';

            int addEl = el1+el2+carry;
            carry = addEl/10;
            addEl = addEl%10;
            ans.append(addEl);

            ptr1--;
            ptr2--;
        }

        while(ptr1>=0){
            int el1 = s1.charAt(ptr1) - '0';  // '0'-> unicode '3'-> unicode
            int addEl = el1+carry;
            carry = addEl/10;
            addEl = addEl%10;
            ans.append(addEl);
            ptr1--;
        }

        while(ptr2>=0){
            int el2 = s2.charAt(ptr2) - '0';  // '0'-> unicode '3'-> unicode
            int addEl = el2+carry;
            carry = addEl/10;
            addEl = addEl%10;
            ans.append(addEl);
            ptr2--;
        }

        if(carry>0)
            ans.append(carry);

        return ans.reverse().toString();


        // O(N+M) time
        // O(N+M) space

    }
}
