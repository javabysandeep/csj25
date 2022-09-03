package classComponents;

public class Product {
    int productId;
    String productName;
    int productPrice;
    static int objectCount = 0;

    public Product(int productId, String productName, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Product() {
        System.out.println("zero param");
    }

    //instance block
    {
        System.out.println("instance block1");
        //return;
    }

    static {
        System.out.println("static block1");
    }



}
