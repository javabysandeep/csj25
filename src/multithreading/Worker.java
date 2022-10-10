package multithreading;

public class Worker extends Thread{
    @Override
    public void run() {
        System.out.println("work");
        System.out.println(Thread.currentThread().getName());
    }
}
