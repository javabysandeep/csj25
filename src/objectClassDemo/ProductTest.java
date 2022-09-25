package objectClassDemo;

public class ProductTest {
    public static void main(String[] args) {
        Product product1 = new Product(1,"laptop");
        Product product2 = new Product(1,"laptop");
        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());
        System.out.println(product1.getClass());

        System.out.println(Integer.toBinaryString(4));
        System.out.println(Integer.toOctalString(4));
        System.out.println(Integer.toHexString(10));

        System.out.println(product1.getClass().getName()+"@"+Integer.toHexString(product1.hashCode()));

        System.out.println(product1);
        System.out.println(product1.toString());
    }
}
