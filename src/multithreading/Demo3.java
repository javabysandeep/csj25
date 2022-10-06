package multithreading;

public class Demo3 {
    public static void main(String[] args) {
        // we are passing an object of class that implements Runnable and overrides run method
        Thread thread = new Thread(()-> System.out.println("running"));
        thread.run();
    }
}
