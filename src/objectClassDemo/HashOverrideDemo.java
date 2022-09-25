package objectClassDemo;

public class HashOverrideDemo {
    public static void main(String[] args) {
        Product product1 = new Product(101,"laptop");
        Product product2 = new Product(1,"mobile");
        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());
        System.out.println(product1);
        System.out.println(product2);
    }
}
