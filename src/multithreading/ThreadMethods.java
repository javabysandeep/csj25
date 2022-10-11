package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class ThreadMethods {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            for (int i = 0; i <100 ; i++) {
                System.out.println(i+Thread.currentThread().getName());
            }
        },"demo");
        thread.setName("customName");
        thread.setDaemon(true);
        thread.start();
        ExecutorService executorService = new ScheduledThreadPoolExecutor(10);
        executorService.submit(()->{});

        thread.join();
        System.out.println("Is Daemon "+thread.isDaemon());
    }
}
