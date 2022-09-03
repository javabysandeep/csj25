package classComponents;

public class LocalInnerClassDemo {
    public static void main(String[] args) {
        class Product {
            int productId=100;
            String productName = "Faulty Projector";
        }
        Product product = new Product();
        System.out.println(product.productId+"\t"+product.productName);
    }
}
