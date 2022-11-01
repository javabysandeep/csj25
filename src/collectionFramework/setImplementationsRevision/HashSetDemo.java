package collectionFramework.setImplementationsRevision;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // unique elements
        // can store homo, heterogeneous
        //can store null but only once
        //no insertion is maintained
        // no sorting order
        Set set = new HashSet();
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
