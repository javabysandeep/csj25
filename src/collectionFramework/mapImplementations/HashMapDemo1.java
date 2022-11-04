package collectionFramework.mapImplementations;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo1 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(11,"Abc");
        map.put(11,"xyzupdated");
        map.put(2,"xyz");
        map.put(3,"Abc");
        map.put(4,"Abc");
        map.put(null,"Abc");
        map.put(null,"Abc");
        map.put(21,null);
        map.put(22,null);
        map.put(23,null);
        map.put(24,null);
        map.put(25,null);
        map.put(26,null);
        System.out.println(map);
        map.remove(null);
        map.remove(24,null);
        System.out.println(map);
        System.out.println("Key is present or not "+ map.containsKey(23));
        System.out.println("Value is present or not "+ map.containsValue(23));
    }
}
