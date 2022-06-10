package assignment.linkedlist;

public class AddOne {

    class Node {
        Node next;
        int data;

        Node(int val) {
            this.data = val;
            next = null;
        }
    }

     Node addOne(Node head){
        Node prev = null;
        Node ptr = head;
        int carry = 1; // adding initially 1

        while(ptr!=null){
            int data = ptr.data+carry; // 10
            ptr.data = data%10;
            carry = data/10;
            prev = ptr;
            ptr = ptr.next;
        }
        // corner case when carry >0 at the end of the list
        if(carry>0){
            Node temp = new Node(carry);
            prev.next = temp;
        }
        return head;
    }
}
