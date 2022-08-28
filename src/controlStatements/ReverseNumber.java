package controlStatements;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 1234567;
        int sum=0,rem;
        int temp=number;
        while(number>0){
            rem=number%10;
            sum=sum*10+rem;
            number/=10;


        }
        System.out.println(sum==temp?"palindrome":"not palindrome");

    }
}
