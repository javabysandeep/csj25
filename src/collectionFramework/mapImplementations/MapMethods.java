package collectionFramework.mapImplementations;

import java.util.*;

public class MapMethods {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("vikram",96);
        marks.put("akshay",35);
        marks.put("rahul",55);
        marks.put("ajay",76);
        marks.put("beta",39);
        marks.put("alpha",67);

        Set<String> keys = marks.keySet();
        System.out.println(keys);//keySet

        Collection<Integer> values = marks.values();
        System.out.println(values);//List of Values

        //entries
        Set<Map.Entry<String, Integer>> entries = marks.entrySet();
        System.out.println("How many entries we have "+entries.size());

        for (Map.Entry<String,Integer> entry: entries) {
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }
    }
}
