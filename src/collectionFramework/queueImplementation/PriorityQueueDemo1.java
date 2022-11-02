package collectionFramework.queueImplementation;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo1 {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue();
        //Elements are processed in natural sorting order
        queue.add(10);
        queue.add(11);
        queue.add(2);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        // 40,30,20,10
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


    }
}
