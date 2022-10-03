package exceptionHandling;

public class Demo16 {
    public static void main(String[] args) {
        try {
            String str = "null";
            System.out.println(str.length());
            System.out.println(10 / 0);
        } catch (NullPointerException nullPointerException) {
            System.out.println("string is null");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("divisor is invalid");
        }
        //multi catch : java 7
        try {
            String str = "null";
            System.out.println(str.length());
            System.out.println(10 / 0);
        }  catch (NullPointerException | ArithmeticException exception){
            System.out.println("invalid input");
        }
    }
}
