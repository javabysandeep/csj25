package oops.inheritance;

public class TestCases {
    public static void main(String[] args) {
       //Case 1:
       /* A a = new A();
        System.out.println(a.a); //100
        System.out.println(a.b); //200
        System.out.println(a.c); *///300

        //Case 2:
        // SC1 : variable only present in parent class. It will access parent class variables
        // SC2 : variable only present in child class. It will access child class variables
        // SC3 : variable are present in both child and parent class. It will access child class variables
        B b  = new B();
        System.out.println(b.a); //1000
        System.out.println(b.b); //2000
        System.out.println(b.c); //3000

        //Case 3: Parent class reference equal to child class object
        // We can assign child class object to the parent class reference
        // SC1 : variable only present in parent class. It will access parent class variables
        // SC2 : variable only present in child class. It will give compile time error
        // SC3 : variable are present in both child and parent class. It will access parent class variables

        //with parent class reference we cant access child class properties.
        A ab = new B();
        System.out.println(ab.a);//100
        System.out.println(ab.b);//200
        System.out.println(ab.c);//300

        //case 4: We cant assign parent class object to child class reference
        //B ba = new A();
    }
}
