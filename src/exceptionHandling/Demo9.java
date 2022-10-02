package exceptionHandling;

public class Demo9 {
    public static void main(String[] args) {
        try {
            m1();

        } catch (ArithmeticException arithmeticException) {
            System.out.println("handled in the main");
        }
        System.out.println("rest of the main");
    }

    static void m1() {
        m2();
    }

    static void m2() {
        m3();
    }

    static void m3() {
        System.out.println(10 / 0);
    }
}
