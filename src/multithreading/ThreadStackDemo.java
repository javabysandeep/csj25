package multithreading;

public class ThreadStackDemo {
    public static void main(String[] args) {
        //java ThreadStackDemo
        // JVM instance is created
        // class is loaded and verified
        // program components are loaded into different memory areas
        // main thread will be created
        // main thread job is execute the main method
        // so every java application has at least one thread i.e. main thread
        // For every thread there is a separate method execution stack is created.
        // for main thread, main method will be the first entry in the stack
        // for every user-defined thread run() method will be the first  method entry in the stack
        // Exception in one thread does not impact other thread execution
        Thread thread = new Thread(()->{
            for (int i = 1; i <=100 ; i++) {
                System.out.println(i+Thread.currentThread().getName());
            }
        },"user-defined");
        thread.start();

        System.out.println(10/0);
        System.out.println("rest of the main thread wont be executed");

    }
}
