package oops.polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10.3f, 20.3f));
        System.out.println(add("abc", "xyz"));
        System.out.println(add(10, 20, 30));
        System.out.println(new MethodOverloading().add("hello ",'A'));
    }

    String add(String str , char ch){
        return str+ch;
    }

    static int add(int number1, int number2) {
        return number1 + number2;
    }

    static float add(float number1, float number2) {
        return number1 + number2;
    }

    static String add(String number1, String number2) {
        return number1 + number2;
    }

    static int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }
}
