package linkedlist;

public class LinkedListClassDefinition {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    static void addNodeToLast(Node head, int d){
        Node ptr = head;
        Node temp = new Node(d); // data to add
        // reach the last element
        while(ptr.next!=null){
            ptr= ptr.next;
        }
        // make the last element point towards temp
        ptr.next = temp;
    }

    static void deleteNode(Node head, Node d){
        Node ptr = head;
        // make ptr point to the node just before d
        while(ptr.next!=d){
            ptr = ptr.next;
        }
        // make ptr point to the node after d
        ptr.next = d.next;
    }
    // 9->2->100->20->null d= 100

    static void printLinkedList(Node head){
        Node ptr = head;
        while(ptr!=null){
            System.out.print(ptr.data+"->");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(9);
    }
}


class Node{
    int data;
    Node next;

    public Node(int d){
        data = d;
        next = null;
    }
}