package collectionFramework.comparableDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1,"abc",100));
        list.add(new Product(11,"xyz",10));
        list.add(new Product(2,"mnp",30));
        list.add(new Product(45,"beta",50));
        list.add(new Product(12,"alpha",11));

//        Comparator<Product> objectOfTypeComparator = (p1,p2)->p1.id-p2.id;
//        Collections.sort(list,(p1,p2)->p1.id-p2.id);
        Collections.sort(list, Comparator.comparingInt(p -> p.price));
        list.forEach(System.out::println);

    }
}
