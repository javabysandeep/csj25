package collectionFramework.queueImplementation;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo4 {
    public static void main(String[] args) {

        //To customize the sorting, we can pass Comparator object
        /*Queue<String> queue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });*/
//        Queue<String> queue = new PriorityQueue<>((o1,o2)->o2.compareTo(o1));
        Queue<String> queue = new PriorityQueue<>(Comparator.reverseOrder());
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
