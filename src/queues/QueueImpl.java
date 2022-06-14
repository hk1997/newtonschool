package queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // 1 2  3

        // q: 3 4 5 6

        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);

        System.out.println(q.peek()); // print 1 but don't remove
        System.out.println(q.poll()); // print 1 and remove
        System.out.println(q.poll()); // print 2 and remove
        q.offer(6);
        System.out.println(q.poll()); // print 3
    }
}
