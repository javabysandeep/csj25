package collectionFramework.comparableDemo;

import java.util.Comparator;

public class Product /*implements Comparable<Product>*/ {
    int id;
    String name;
    int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    /*@Override
    public int compareTo(Product o) {
        return this.id-o.id;
    }*/
}
