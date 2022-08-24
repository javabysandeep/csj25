package oops;

public class LocalInstanceDemo {
    int a = 100;//instance variable
    static int b = 200; // static variable

    public static void main(String[] args) {
        int a = 300;//local variable
        int b = 400; // local variable
        System.out.println("Local variable " + a);//300
        System.out.println("Local variable " + b);//400

        LocalInstanceDemo ref = new LocalInstanceDemo();
        System.out.println("Instance variable " + ref.a);
        System.out.println("Static variable " + LocalInstanceDemo.b);
        m1();

    }

    static void m1() {
        int a = 500;
        int b = 600;
        System.out.println("m1 method ");
        System.out.println("Local variable " + a);//500
        System.out.println("Local variable " + b);//600

        LocalInstanceDemo ref = new LocalInstanceDemo();
        System.out.println("Instance variable " + ref.a);
        System.out.println("Static variable " + LocalInstanceDemo.b);
    }
}
