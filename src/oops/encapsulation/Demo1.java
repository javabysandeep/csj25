package oops.encapsulation;

public class Demo1 {
    public static void main(String[] args) {
        Product product = new Product(1, "Laptop",1000);
      //  System.out.println(product.productId);
        //System.out.println(product.productName);
        System.out.println("Product ID "+ product.getProductId());
//        product.productPrice = -100;
        product.setProductPrice(-100);
        System.out.println(product.getProductPrice());
    }
}
