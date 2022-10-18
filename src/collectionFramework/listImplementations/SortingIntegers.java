package collectionFramework.listImplementations;

import java.util.*;

public class SortingIntegers {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(18);
        integerList.add(19);
        integerList.add(10);
        integerList.add(1);
        integerList.add(12);
        integerList.add(15);
        integerList.add(17);

        System.out.println(integerList);
        System.out.println("sorted list");

        Collections.sort(integerList);
        System.out.println(integerList);

    }
}
