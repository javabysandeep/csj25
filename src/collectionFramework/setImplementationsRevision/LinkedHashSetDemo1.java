package collectionFramework.setImplementationsRevision;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        // unique elements
        //insertion order is maintained
        // can store homo, heterogeneous
        //can store null but only once
        // no sorting order
        Set set = new LinkedHashSet();
        set.add(10);
        set.add(10);
        set.add("abc");
        set.add("abc");
        set.add(null);
        set.add(null);
        set.add(null);
        System.out.println(set);
    }
}
