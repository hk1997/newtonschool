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


    class Node{
        int val;
        Node next;

        public Node(int data){
            val = data;
            next = null;
        }
    }
}
