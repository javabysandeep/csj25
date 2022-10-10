package multithreading;

public class PreventThreadExecution3 {
    public static void main(String[] args) throws InterruptedException {
       Thread thread1 = new Thread(()-> {
           try {
               Thread.sleep(5000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           System.out.println(Thread.currentThread().getName());
       },"thread1");
       thread1.setPriority(10);

       Thread thread2 = new Thread(()-> {
           try {
               Thread.sleep(5000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           System.out.println(Thread.currentThread().getName());
       },"thread2");
       thread2.setPriority(10);

        Thread.yield();
        thread1.start();
        thread2.start();

        Thread.sleep(5000);
       //main thread body
        System.out.println(Thread.currentThread().getName());
    }
}
