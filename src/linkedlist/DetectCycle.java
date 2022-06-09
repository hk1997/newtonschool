package linkedlist;

import java.util.HashSet;

public class DetectCycle {


    boolean isCycleUsingSets(Node head){

        HashSet<Node> hs = new HashSet<>();
        Node ptr = head;

        while(ptr!=null){
            if(hs.contains(ptr))
                return true;
            hs.add(ptr);
            ptr = ptr.next;
        }
        return false;
        /**
         * Time Complexity: O(n)
         * Space Complexity: O(n) since you are storing elements in this set
         */
    }

    boolean isCycleUsingSlowFastPointers(Node head){
        Node slow = head, fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            // there exist a cycle
            if(slow==fast)
                return true;
        }
        return false;
        /**
         * Time complexity: O(n)
         * Space complexityL O(1)
         */
    }

    Node pointOfCycle(Node head){
        Node slow = head, fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            // there exist a cycle
            if(slow==fast)
                break;
        }
        // check if there is cycle
        if(slow==fast){
            slow = head;
            while(slow!=fast){
                slow= slow.next;
                fast = fast.next;
            }
            return slow;// or return fast, both are same
        }
        else{
            return null;// no cycle in the linked list
        }

    }


    class Node{
        int val;
        Node next;

        public Node(int data){
            val = data;
            next = null;
        }
    }
}
