package exceptionHandling;

public class Demo2 {
    public static void main(String[] args) {

        try {
            System.out.println(10/0);
            System.out.println("try");
        }
        catch (ArithmeticException arithmeticException){
            System.out.println(10/0);
            System.out.println(arithmeticException.getMessage());
        }
        System.out.println("rest of the code");
    }
}
