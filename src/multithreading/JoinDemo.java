package multithreading;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            for (int i = 0; i <100 ; i++) {
                System.out.println(i+" "+Thread.currentThread().getName());
            }
        },"custom");
        thread.start();

        thread.join();
        for (int i = 0; i < 100; i++) {
            System.out.println(i+Thread.currentThread().getName());
        }
    }
}
