package exceptionHandling;

public class Demo6 {
    public static void main(String[] args) {
        try {
            String str = "null";
            System.out.println(str.length());
            System.out.println(10 / 1);
            System.out.println(10 / 1);
            int[] array = new int[3];
            System.out.println(array[5]);
        } catch (NullPointerException nullPointerException) {
            System.out.println("String is pointing to null");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("divisor is invalid");
        } catch (Throwable throwable) {
            System.out.println("generic handler");
        }


        System.out.println("rest of the code");
    }
}
