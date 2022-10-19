package collectionFramework.setImplementations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        //unique
        //no insertion order
        //no sorting order
        // can hold homogeneous
        // can hold heterogeneous
        // can hold null but only once
        // Internally HashSet uses HashMap and HashMap uses hashing

        Set integers = new HashSet<>();
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
