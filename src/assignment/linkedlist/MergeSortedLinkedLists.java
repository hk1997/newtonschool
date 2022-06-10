package assignment.linkedlist;

public class MergeSortedLinkedLists {

class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}

/*
below function is used to insert nodes in the linked list
public static Node insert111(Node head, int val) {
        if(head == null) {
            return new Node(val);
        } else {
            Node cur;
            cur = insert111(head.next, val);
            head.next = cur;
            return head;
        }
    }

*/
    public  Node Merge (Node head1, Node head2){
//Enter your code here
        Node dummyHead = new Node(-1);
        Node tail = dummyHead;
        Node ptr1 = head1;
        Node ptr2 = head2;

        while(ptr1!=null && ptr2!=null){
            if(ptr1.val < ptr2.val){
                // add ptr1
                tail.next = ptr1;
                ptr1 = ptr1.next;
                tail = tail.next;
                tail.next = null;
            }
            else{
                tail.next = ptr2;
                ptr2= ptr2.next;
                tail = tail.next;
                tail.next = null;
            }
        }

        while(ptr1!=null){
            tail.next = ptr1;
            ptr1 = ptr1.next;
            tail = tail.next;
            tail.next = null;
        }

        while(ptr2!=null){
            tail.next = ptr2;
            ptr2 = ptr2.next;
            tail = tail.next;
            tail.next = null;
        }

        return dummyHead.next;
    }
}
