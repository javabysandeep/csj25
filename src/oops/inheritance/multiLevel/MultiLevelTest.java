package oops.inheritance.multiLevel;

import java.util.Scanner;

public class MultiLevelTest {
    public static void main(String[] args) {
        A a = new A();
        a.m1(); // class A m1()
        System.out.println(a.a);//100

        B b = new B();
        b.m1(); // Class B m1
        b.m2(); // class b M2
        System.out.println(b.a);//200

        A ab = new B();
        System.out.println(ab.a);//100
        ab.m1(); // Class B m1()
//        ab.m2();

        C c = new C();
        System.out.println(c.a);// if a is not in C class, then immediate parent
        c.m1();// class c m1 method
        c.m2(); // class B m2 method
        c.m3(); // class C m3 method

        B bc = new C();
        bc.m1();
        bc.m2();
        System.out.println(bc.a);//200
        //bc.m3();

        A ac = new C();
        a.m1();
        System.out.println(ac.a);//100
        //a.m2();
        //a.m3();

    }
}
