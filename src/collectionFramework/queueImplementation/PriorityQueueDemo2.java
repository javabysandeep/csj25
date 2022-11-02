package collectionFramework.queueImplementation;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo2 {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue();
        //Elements are processed in natural sorting order
        // Elements should be of same type as elements are sorted and then processed
        queue.add("symbol");
        queue.add("chars");
        queue.add("python");
//        queue.add(null);//NullPointerException

        // 40,30,20,10
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


    }
}
