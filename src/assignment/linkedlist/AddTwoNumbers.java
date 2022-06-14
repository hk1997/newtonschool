package assignment.linkedlist;

public class AddTwoNumbers {
    /*
class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

1234 -> 4->3->2->1

99
1

sum =10
number= sum%10
carry = sum/10
1 1
999
 11
1 0 1 0

9 9 9

1 1

0-> 1 -> 0 -> 1

carry = 0

step 1:
sum = 9+1+carry = 10
no= 10%10 = 0
carry = 10/10 = 1

Step 2:
sum = 9+1+carry = 11
no = 11%10 = 1
carry = 11/10 = 1

Step 3:
sum = 9+carry = 9+1 = 10
no = 10%10 = 0
carry = 10/10 = 1

if after iterating through both list, carry exists you simply add a new node with carry

*/

//    static Node addNumber(Node first, Node second){
//// return the head of the modified linked list
//        Node dummyHead = new Node(-1); // sentinel node
//        Node ptr1 = first;
//        Node ptr2 = second;
//        Node listPtr = dummyHead; // points to tail of ans list
//        int carry = 0;
//
//        while(ptr1!=null && ptr2!=null){
//            int sum = ptr1.data + ptr2.data + carry;
//            Node temp = new Node(sum%10);
//            carry = sum/10;
//
//            listPtr.next = temp;
//            listPtr = listPtr.next;
//            ptr1 = ptr1.next;
//            ptr2 = ptr2.next;
//        }
//
//        while(ptr1!=null){
//            int sum = ptr1.data  + carry;
//            Node temp = new Node(sum%10);
//            carry = sum/10;
//
//            listPtr.next = temp;
//            listPtr = listPtr.next;
//            ptr1 = ptr1.next;
//        }
//
//        while(ptr2!=null){
//            int sum =  ptr2.data + carry;
//            Node temp = new Node(sum%10);
//            carry = sum/10;
//
//            listPtr.next = temp;
//            listPtr = listPtr.next;
//            ptr2 = ptr2.next;
//        }
//
//        // if carry is 1
//        if(carry > 0 ){
//            Node temp = new Node(carry);
//            listPtr.next = temp;
//            listPtr = listPtr.next;
//        }
//
//        return dummyHead.next;
//
//
//    }
}
