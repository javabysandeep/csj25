package multithreading;

public class WorkerDemo {
    public static void main(String[] args) {
       //How to create Thread? way 1: create a class by extending Thread class
        Worker worker = new Worker();
       worker.setName("workerAkash");
       worker.start();

        //How to create Thread? way 2: Create a subclass by implementing Runnable
//        Runnable runnable = new WorkerRunnable();
       /* Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("working");
                System.out.println(Thread.currentThread().getName());
            }
        };*/
        Runnable runnable = ()->{
            System.out.println("working");
            System.out.println(Thread.currentThread().getName());
        };
        //runnable.start();//CTE as start() is present in Thread class
        Thread thread = new Thread(runnable,"WorkerRunnable");
        thread.start();
    }
}
