package exceptionHandling;

public class Demo18 {
    public static void main(String[] args) {
        try {
            throw new Exception1();
        } catch (Exception0 exception) {
            System.out.println("exception0 caught");
        } catch (Exception exception) {
            System.out.println("exception caught");
        }
    }
}

class Exception0 extends Exception {
}

class Exception1 extends Exception0 {
}