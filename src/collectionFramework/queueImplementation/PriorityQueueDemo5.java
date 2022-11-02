package collectionFramework.queueImplementation;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo5 {
    public static void main(String[] args) {
        //process the elements based on their length
//        Queue<String> queue = new PriorityQueue<>((s1,s2)->s1.length()-s2.length());
        Queue<String> queue = new PriorityQueue<>(Comparator.comparingInt(String::length));
        queue.add("symbol");
        queue.add("chars");
        queue.add("alpha");
        queue.add("ba");
        queue.add("gam");
        queue.add("r");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


    }
}
