package oops.polymorphism;

public class Substraction {
  // jVM will call this main method with valid signature
    public static void main(String[] args) {
        System.out.println(sub(20,10));
        main();
    }
    public static void main() {
        System.out.println("main method overloaded");
    }

    private static int sub(int number1, int number2) {
        return number1-number2;
    }
    // in method overloading we don't consider method return type.
    /*private static double sub(int number1, int number2) {
        return (double) (number1-number2);
    }*/
    private static float sub(float number1, float number2) {
        return number1- number2;
    }
}
