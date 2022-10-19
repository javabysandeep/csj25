package collectionFramework.setImplementations;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        //unique
        // can hold only homogeneous
        // elements will be in sorting order
        // cannot hold heterogeneous data
        // insertion order will be not maintained
        // can not hold null even once
        // Internally TreeSet uses Red Black Tree Data structure.

        Set<String> names = new TreeSet();
        names.add("shubham");
        names.add("akshay");
        names.add("vikram");
        names.add("sanket");
        names.add("prem");
        names.add("bhushan");
        System.out.println(names);

    }
}
