package controlStatements;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        int startPoint = 2;
        int endPoint = 1000;
        int primeCount = 0;

        for (int index = startPoint; index <= endPoint; index++) {
            //check each number is prime or not.
            boolean isPrime = isPrime(index);
            if(isPrime)primeCount++;
            System.out.println(isPrime ? "Its prime " + index : "");
        }
        System.out.println("Prime count "+primeCount);

    }

    private static boolean isPrime(int number) {
        boolean result = true;
        for (int index = 2; index<=number/2; index++) {
         if (number%index==0){
             return  false;
         }
        }
        return  result;
    }
}
