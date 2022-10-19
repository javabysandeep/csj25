package collectionFramework.setImplementations;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //unique
        // insertion order will be maintained
        //no sorting order
        // can hold homogeneous
        // can hold heterogeneous
        // can hold null but only once
        // Internally HashSet uses HashMap and HashMap uses hashing

        Set integers = new LinkedHashSet();
        System.out.println(integers.add(10));
        System.out.println(integers.add("abc"));
        System.out.println(integers.add(null));
        System.out.println(integers.add("abc"));
        System.out.println(integers.add(null));
        System.out.println(integers.add(10));
        System.out.println(integers.add(10));
        System.out.println(integers);

    }
}
