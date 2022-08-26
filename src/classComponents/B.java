package classComponents;

import array.Demo1;

public class B {


    static public void main(String[] temp) {
        System.out.println("B class main method");

        String[] arrayOfStrings = new String[5];
        arrayOfStrings[0] = "input from B class";
        A.main(arrayOfStrings);// callling main method explicitly

        // Demo class main method
        Demo1.main(null);
    }
}
