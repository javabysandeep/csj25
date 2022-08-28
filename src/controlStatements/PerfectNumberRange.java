package controlStatements;

public class PerfectNumberRange {
    public static void main(String[] args) {
        int startPoint = 1;
        int endPoint = 10000;

        for (int i = startPoint; i <= endPoint; i++) {
            if (isPerfect(i)) {
                System.out.println("Perfect number " + i);
            }
        }

    }

    private static boolean isPerfect(int number) {
        int sumOfFactors = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfFactors += i;
            }
        }
        return sumOfFactors == number;

    }
}
