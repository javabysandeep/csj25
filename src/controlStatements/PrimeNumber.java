package controlStatements;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 13;
        boolean flag = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        System.out.println((flag) ? "Its prime." : "Its not a prime");
        /*int a = 10;
        int i = a / 2;
        System.out.println(a);
        System.out.println(i);
        System.out.println(a % 2 == 0 ? a : a + 1);//
        a = a/2;
        System.out.println(a);*/
    }
}
