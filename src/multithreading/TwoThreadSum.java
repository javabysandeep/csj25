package multithreading;

public class TwoThreadSum {
    long start;
    long end;
    long counter = 0;

    public TwoThreadSum(long start, long end) {
        this.start = start;
        this.end = end;
    }

    void add() {
        for (long index = start; index <= end; index++) {
            counter += index;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        TwoThreadSum s1 = new TwoThreadSum(0, Integer.MAX_VALUE / 2);
        TwoThreadSum s2 = new TwoThreadSum(Integer.MAX_VALUE / 2 + 1, Integer.MAX_VALUE);

        Thread thread = new Thread(s1::add);
        thread.start();

        Thread thread1 = new Thread(s2::add);
        thread1.start();

        long endTime = System.currentTimeMillis();

        thread1.join();
        thread.join();

        System.out.println("Sum " + (s1.counter + s2.counter));
        System.out.println("Time taken " + (endTime - startTime));
    }
}
