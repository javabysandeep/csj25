package multithreading;

public class PreventThreadExecution2 {
    public static void main(String[] args) throws InterruptedException {
       Thread thread1 = new Thread(()-> {
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           System.out.println(Thread.currentThread().getName());
       },"thread1");
       Thread thread2 = new Thread(()-> {
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           System.out.println(Thread.currentThread().getName());
       },"thread2");

        thread1.start();
        thread2.start();

        thread1.join(500000000);
        thread2.join(500000000);

       //main thread body
        System.out.println(Thread.currentThread().getName());
    }
}
