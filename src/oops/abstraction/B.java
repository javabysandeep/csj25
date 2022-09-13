package oops.abstraction;

public abstract class B extends A{
    @Override
    void m1() {
        System.out.println("m1 implemented in B class");
    }
    abstract void m3();
}
