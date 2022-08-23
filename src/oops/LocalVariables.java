package oops;

public class LocalVariables {

    //arrayOfStrings is an local reference variable
    public static void main(String[] arrayOfStrings) {
        int localVariable =100;
        System.out.println(localVariable);
        System.out.println(add(100,200));//100, 200 are arguments
    }
    static int add(int number1, int number2){
        int count = 100;
        // local variable : number1, number2, count
        return number1+number2;
    }

}
