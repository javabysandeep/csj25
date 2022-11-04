package collectionFramework.mapImplementations;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> marks = new LinkedHashMap();
        marks.put("vikram",96);
        marks.put("akshay",35);
        marks.put("rahul",55);
        marks.put("ajay",76);
        marks.put("beta",39);
        marks.put("alpha",67);

        System.out.println(marks);
    }
}
