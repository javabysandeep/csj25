package oops.inheritance;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.gold);
        System.out.println(child.silver);

        B b = new B();
        System.out.println(b.a);
        System.out.println(b.b);

        C c = new C();
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
    }
}
