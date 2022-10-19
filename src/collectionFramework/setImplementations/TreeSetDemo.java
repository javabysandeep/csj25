package collectionFramework.setImplementations;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //unique
        // can hold only homogeneous
        // elements will be in sorting order
        // cannot hold heterogeneous data
        // insertion order will be not maintained
        // can not hold null even once
        // Internally TreeSet uses Red Black Tree Data structure.

        Set integers = new TreeSet();
        System.out.println(integers.add(10));
        System.out.println(integers.add(20));
        System.out.println(integers.add(1));
        System.out.println(integers.add(-3));
        System.out.println(integers.add(99));
        System.out.println(integers.add(99));
        System.out.println(integers);

    }
}
