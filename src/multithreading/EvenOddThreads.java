package multithreading;

public class EvenOddThreads {
    public static void main(String[] args) {
        Thread even = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " " + Thread.currentThread().getName());
                }
            }
        }, "even");
        Thread odd = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                if (i % 2 != 0) {
                    System.out.println(i + " " + Thread.currentThread().getName());
                }
            }
        }, "odd");
        even.start();
        odd.start();

    }
}
