package collectionFramework.listImplementations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List list = new LinkedList();
        System.out.println(list.add(100));
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);
        list.add("string");
        list.add('a');
        list.add(false);
        list.add(null);
        list.add(null);
        System.out.println(list.size());
        System.out.println(list);
        list.remove("string");
        System.out.println(list);
        System.out.println(list.isEmpty());
        Object[] objects = list.toArray();
        System.out.println(list.contains('a'));

    }
}
