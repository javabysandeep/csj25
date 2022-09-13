package oops.abstraction;

public abstract class CustomList {
    int a = 100;
    static int b = 200;
    {
        System.out.println("instance block");
    }
    static {
        System.out.println("static block");
    }
    void m1(){
        System.out.printf("instance method");
    }
    static void m2(){
        System.out.printf("static method");
    }
    // Everything from concrete class + abstract methods
   abstract boolean add(Object object);

    public CustomList() {
        System.out.print("Abstract class constructor");
    }
    class Inner{}
    static class NestedClass{}

    public static void main(String[] args) {
        System.out.println("main method in abstract class");
        //CustomList customList = new CustomList();
    }

}