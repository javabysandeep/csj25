package oops.abstraction;

public  abstract class List {
  // I can write all the things from concrete class and abstract methods.
    List(){
        System.out.println("Abstract class con");
    }


    public static void main(String[] args) {
        System.out.println("main");

        //we can't create object of an abstract class.
        // abstract means incomplete.
        //how can we call the constructor?
        List list = new ArrayListCustom();
    }

}
class ArrayListCustom extends List {
    ArrayListCustom(){
        super();
        System.out.println("ArrayList con");
    }
}
/*
* concrete method : method with impl or body
* concrete class : class contains only concrete methods. a class without abstract
* abstract method : method which created with abstract keyword & without impl/body
* abstract class : a class which is created with abstract keyword
*
* abstract class can be empty
*
* */

