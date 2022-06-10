package doublylinkedlist;

public class DoublyLinkedList {

    DNode head = null;

    void addLast(int el){
        DNode temp = new DNode(el);

        // if list is empty
        if(head==null){
            head = temp;
        }
        else{
            DNode ptr = head;

            while(ptr.next!=null){
                ptr = ptr.next;
            }

            ptr.next = temp;
            temp.prev = ptr;
        }
    }

    void addFirst(int el){
        DNode temp = new DNode(el);

        // empty list
        if(head==null){
            head = temp;
        }
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    void delete(DNode node){

        if(node == head){
            head = node.next;
            if(head!=null)
                head.prev = null;
        }
        // end of linkedlist
        else if(node.next==null){
            node.prev.next = null;
        }
        else{

        }
    }

    class DNode{
            int val;
            DNode next;
            DNode prev;

            public DNode(int d){
                val = d;
                next = null;
                prev = null;
            }
    }

}
