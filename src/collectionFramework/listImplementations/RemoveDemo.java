package collectionFramework.listImplementations;

import java.util.ArrayList;
import java.util.List;

public class RemoveDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList();
        integerList.add(10);
        integerList.add(11);
        integerList.add(12);
        integerList.add(13);
        integerList.add(20);
//        integerList.add("abc");
        System.out.println(integerList);

        List<Integer> deleteList = new ArrayList<>();
        deleteList.add(10);
        deleteList.add(11);
        integerList.remove(Integer.valueOf(20));
//        integerList.remove(2);
//        integerList.removeAll(deleteList);
//        integerList.clear();
        integerList.removeIf((integer) -> integer % 2 == 0);
        System.out.println(integerList);
    }
}
