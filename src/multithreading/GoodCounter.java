package multithreading;

public class GoodCounter {
    int counter = 0;

    void increment() {
        synchronized (this){
            counter++;
        }
    }
    void decrement() {
        synchronized (this){
            counter--;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        GoodCounter badCounter = new GoodCounter();
        Thread increment = new Thread(()->{
            for (int i = 1; i <=100000 ; i++) {
                badCounter.increment();
            }
        },"increment");

        Thread decrement = new Thread(()->{
            for (int i = 1; i <=100000 ; i++) {
                badCounter.decrement();
            }
        },"decrement");

        increment.start();
        decrement.start();

        //main will wait for increment and decrement threads to complete the execution
        increment.join();
        decrement.join();
        
        System.out.println("Final counter "+badCounter.counter);
    }
}
