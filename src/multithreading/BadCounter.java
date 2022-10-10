package multithreading;

public class BadCounter {
    int counter = 0;

    void increment() {
        counter++;
    }
    void decrement() {
        counter--;
    }

    public static void main(String[] args) throws InterruptedException {
        BadCounter badCounter = new BadCounter();
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
