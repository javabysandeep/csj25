package multithreading;

public class WorkerRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("working");
        System.out.println(Thread.currentThread().getName());
    }
}
