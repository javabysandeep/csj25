package multithreading;

public class Demo1 {
    public static void main(String[] args) {
        //way 1
        Runnable runnable = new RunnableImpl();
        runnable.run();

        //way 2 using anonymous class
        Runnable  runnable1 = new Runnable(){
            @Override
            public void run() {
                System.out.println("anonymous run");
            }
        };
        runnable1.run();

        //way 3: using lambda expression
        Runnable lambda = () -> System.out.println("lambda run");
        lambda.run();
    }
}
class RunnableImpl implements Runnable{

    @Override
    public void run() {
        System.out.println("Running");
    }
}