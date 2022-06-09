package linkedlist;

public class LinkedListWithCornerCases {

    Node head;

    /**
     * Function to add data to the end of the linked list
     * @param data
     */
    void addLast(int data){
            // Create a new list node to add to the list
        // head -> 1->2->3-> null
        Node temp = new Node(data);
        if(head==null){
            head= temp;
            return;
        }
        else{
            // move to the end of the list
            Node ptr = head;
            while(ptr.next!=null){
                ptr = ptr.next;
            }
            ptr.next = temp;
        }
    }

    void addFirst(int data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    void deleteNode(Node n){

        if(n==head){
            // deleting the first node
            head = head.next;
        }
        else{
            Node ptr = head;
            while(ptr.next!=n){
                ptr= ptr.next;
            }

            ptr.next = n.next;
        }
    }

    public static void main(String[] args) {

    }



    class Node{
        int val;
        Node next;

        public Node(int d){
            val = d;
            next = null;
        }
    }
}
