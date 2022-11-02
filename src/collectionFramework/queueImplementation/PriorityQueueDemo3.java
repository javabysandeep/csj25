package collectionFramework.queueImplementation;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo3 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("symbol");
        queue.add("chars");
        queue.add("alpha");
        queue.add("beta");
        queue.add("gama");
        queue.add("rama");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


    }
}
