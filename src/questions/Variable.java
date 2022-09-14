package questions;

import java.time.LocalDateTime;

public class Variable {
    int number = 100;//instance, default access
    static int number2 = 200;//static
    static  int count = 0;
    //instance block will be called everytime we create object
    {
        System.out.println("instance block");
        count++;
        System.out.println("Object is created at "+ LocalDateTime.now());
    }

    //static block
    static {
        System.out.println("One time activity. DB connection, server connection");
    }
    Variable(int number){
        this.number = number;
        //count++;
    }
    Variable(){
        System.out.println("zero param con");
       // count++;
    }
    public static void main(String[] args) {
        // no access specifier on local variable
        // we cant access variables outside of the method
        int localVariable = 100;
        Variable variable = new Variable();
        Variable variable1 = new Variable(200);
        System.out.println("no. of objects created "+Variable.count);
        //
    }
}
