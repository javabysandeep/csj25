package collectionFramework.comparableDemo;

import java.util.Comparator;

public class Demo2 {
    public static void main(String[] args) {
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };

        Comparator comparator1 = (s1,s2)->0;
    }
}
class ProductComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
