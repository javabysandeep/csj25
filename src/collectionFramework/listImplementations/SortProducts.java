package collectionFramework.listImplementations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortProducts {
    public static void main(String[] args) {
        Product product1 = new Product(101, "mobile", 9000);
        Product product2 = new Product(11, "laptop", 31000);
        Product product3 = new Product(1, "charger", 1800);
        Product product4 = new Product(102, "cable", 120);
        Product product5 = new Product(14, "case", 3100);

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

        for (Product product : productList) {
            System.out.println(product);
        }
        System.out.println("After sorting");
        //Comparator
       // Collections.sort(productList, (p1, p2) -> p1.productId-p2.productId);

       // Collections.sort(productList, new ProductComparator());

       /* Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return  o1.productId - o2.productId;
            }
        });*/
        Collections.sort(productList, Comparator.comparingInt(p -> p.productId));

        for (Product product : productList) {
            System.out.println(product);
        }
    }
    static class ProductComparator implements  Comparator<Product>{
        @Override
        public int compare(Product p1, Product p2) {
            return p1.productId-p2.productId;
        }
    }
}
