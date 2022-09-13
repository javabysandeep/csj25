package oops.abstraction;

public class C extends B{

    @Override
    void m1() {
        super.m1();
        System.out.println("m1 implemented in C");
    }

    @Override
    void m2() {
        System.out.println("m2 implemented in C class");
    }

    @Override
    void m3() {
        System.out.println("m3 implemented in C class");
    }
}
