package oops.abstraction;

public class Abstraction {
    public static void main(String[] args) {
        B bc = new C();
        bc.m1();
        bc.m2();
        bc.m3();
        A ac = new C();
        ac.m1();
        ac.m2();
//        ac.m3();
    }
}
