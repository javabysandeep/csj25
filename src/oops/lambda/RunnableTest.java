package oops.lambda;

import java.util.function.Function;

public class RunnableTest {
    public static void main(String[] args) {
        // 1. create separate concrete subclass
        Runnable runnable = new RunnableImpl();
        runnable.run();

        //2. create anonymous class
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("running anonymous way");
            }
        };
        runnable1.run();

        //way 3. lambda
        Runnable lambda = ()-> System.out.println("running lambda");
        lambda.run();

    }
}
class RunnableImpl implements  Runnable{
    @Override
    public void run() {
        System.out.println("running");
    }
}
