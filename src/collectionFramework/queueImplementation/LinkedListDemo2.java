package collectionFramework.queueImplementation;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        Queue queue = new LinkedList();//FIFO
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        // 40,30,20,10
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
//        System.out.println(queue.remove());//NoSucElementException
        System.out.println(queue.poll());//null
        System.out.println(queue.peek());//null
        System.out.println(queue.element());//NoSucElementException

    }
}
