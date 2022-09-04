package classComponents;

import java.time.LocalDateTime;

public class Order {
    int orderId;
    String orderTitle;
    static int count = 0;

    public Order() {
    }

    public Order(int orderId, String orderTitle) {
        this.orderId = orderId;
        this.orderTitle = orderTitle;
    }

    {
        System.out.println("order is placed at "+ LocalDateTime.now());
        count++;
    }
    {
        System.out.println("instance block");
    }

    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();
        Order order5 = new Order();
        Order order6 = new Order();
        System.out.println("Number of orders placed till now "+Order.count);
    }
}
