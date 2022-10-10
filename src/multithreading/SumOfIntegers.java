package multithreading;

public class SumOfIntegers {
    long start;
    long end;
    long counter = 0;

    public SumOfIntegers(long start, long end) {
        this.start = start;
        this.end = end;
    }

    void add() {
        for (long index = start; index <= end; index++) {
            counter += index;
        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        SumOfIntegers s1 = new SumOfIntegers(0, Integer.MAX_VALUE / 2);
        SumOfIntegers s2 = new SumOfIntegers(Integer.MAX_VALUE / 2 + 1, Integer.MAX_VALUE);
        s1.add();
        s2.add();
        long endTime = System.currentTimeMillis();
        System.out.println("Sum " + (s1.counter + s2.counter));
        System.out.println("Time taken " + (endTime - startTime));
    }
}
