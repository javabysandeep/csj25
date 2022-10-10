package multithreading;

public class PreventThreadExecution1 {
    public static void main(String[] args) throws InterruptedException {
        for (int index = 0; index < 100; index++) {
            //stops the currently executing thread for specified time interval
            Thread.sleep(5000);
            System.out.println(index);
        }
    }
}
