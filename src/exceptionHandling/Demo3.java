package exceptionHandling;

public class Demo3 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
            System.out.println(10 / 1);
            System.out.println(10 / 1);
        } catch (NullPointerException nullPointerException) {
            System.out.println("String is pointing to null");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("divisor is invalid");
        }


        System.out.println("rest of the code");
    }
}
