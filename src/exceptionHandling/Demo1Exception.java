package exceptionHandling;

import java.io.IOException;

public class Demo1Exception {
    public static void main(String[] args) {
        System.out.println(1);
//        System.out.println(10/0);
        String str = null;
        System.out.println(str.length());
        System.out.println(1);
        System.out.println(1);
//        Dem999 d = new Dem999();//ClassNotFoundException
       // Demo demo = new Demo(); //InstantiationException
        //System.out.println(Demo.variable); //NoSuchFieldException
        //System.out.println(Demo.method()); //NoSuchMethodException
//        System.out.println(Demo.number);//IllegalAccessException

    }
}
 class Demo{
private static int number = 100;
}
