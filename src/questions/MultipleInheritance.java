package questions;

public class MultipleInheritance {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);//1
        System.out.println(a.b);//2
        System.out.println(a.c);//3
        a.m1();//A m1()
        a.m2();//A m2()

        B b = new B();
        System.out.println(b.a);//10
        System.out.println(b.b);//20
        System.out.println(b.c);//30
        b.m1();//B m1
        b.m2(); //B m2

        A ab = new B();//parent class ref and child class obj
        System.out.println(ab.a);//1
        System.out.println(ab.b);//2
        System.out.println(ab.c);//3
        ab.m1();//B m1
        ab.m2(); //B m2

        // C class
        System.out.println("C class details");
        C c = new C();
        System.out.println(c.a);//100
        System.out.println(c.b);//200
        System.out.println(c.c);//300
        c.m1();//C m1()
        c.m2();//C m2()

        B bc = new C();
        System.out.println(bc.a);//10
        System.out.println(bc.b);//20
        System.out.println(bc.c);//30
        bc.m1();//C m1
        bc.m2(); //C m2

        A ac = new C();//parent class ref and child class obj
        System.out.println(ac.a);//1
        System.out.println(ac.b);//2
        System.out.println(ac.c);//3
        ac.m1();//C m1
        ac.m2(); //C m2


    }
}
