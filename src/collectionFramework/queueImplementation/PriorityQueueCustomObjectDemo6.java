package collectionFramework.queueImplementation;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueCustomObjectDemo6 {
    public static void main(String[] args) {
        Queue<Employee> queue = new PriorityQueue<>((e1,e2)-> e1.salary-e2.salary);
        queue.add(new Employee(11, "abc", 10000));
        queue.add(new Employee(1, "zy", 4500));
        queue.add(new Employee(2, "mno", 2300));
        queue.add(new Employee(30, "efg", 100000));
        queue.add(new Employee(11, "pqr", 3000000));
        queue.add(new Employee(9, "ijk", 3499));

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


    }
}
