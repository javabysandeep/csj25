package collectionFramework.setImplementationsRevision;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        // unique elements
        // can store only homogeneous
        // sorting order is maintained
        //cannot store null even once
        //no insertion is maintained
        Set set = new TreeSet();
//        set.add(10);
//        set.add(10);
       // set.add("abc");
        //set.add("abc");
//        set.add(null);
//        set.add(null);
//        set.add(null);

        set.add(101);
        set.add(2);
        set.add(30);
        set.add(4);
        System.out.println(set);
    }
}
