package oops.inheritance.multiLevel;

public class B extends A{
    int a = 200;
    public B() {
        //super();
        System.out.println("B");
    }
    void m1(){
        System.out.println(" B m1");
    }
    void m2(){
        System.out.println(" B m2");
    }
}
