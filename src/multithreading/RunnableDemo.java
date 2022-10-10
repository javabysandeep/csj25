package multithreading;

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            for (int i = 0; i <10 ; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        };
        runnable.run();

    }
}
