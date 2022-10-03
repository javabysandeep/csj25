package exceptionHandling;

public class Demo17 {
    public static void main(String[] args) {
        assert (add(10, 20) == 30);
    }

    static int add(int number1, int number2) {
        return number1 + number2;
    }
}
