package linkedlist;

public class LinkedListClassDefinition {

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