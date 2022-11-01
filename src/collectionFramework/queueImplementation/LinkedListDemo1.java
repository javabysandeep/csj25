package collectionFramework.queueImplementation;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        //System.out.println(queue.remove());//remove: exception
//        System.out.println(queue.poll());//poll: null

        //whos is next
        System.out.println(queue.peek());//peek: null
        System.out.println(queue.element());//element: exception
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());


        //insertion : add(), offer();
        //deletion: remove(), poll()
        //inspection of head/ checking whos next, it wont delete the element
        // peek(), element();


    }
}
