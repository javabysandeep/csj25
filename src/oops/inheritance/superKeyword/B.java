package oops.inheritance.superKeyword;

public class B extends A{
   /* int a = 100;
    int b = 200;
    int c = 300;
    int d = 400;*/

    void m1() {
        System.out.println("B class m1");
    }

    public B() {
        // In java every constructor has this line as first one to the super class con
        super();// call to the super class con
        System.out.println("B class con");
    }

    public B(int a, int b, int c, int d) {
        this();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    void display(){
        System.out.println("B class values ");
        System.out.println("B{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}');

        System.out.println("B{" +
                "a=" + this.a +
                ", b=" + this.b +
                ", c=" + this.c +
                ", d=" + this.d +
                '}');
        System.out.println("Super class values");

        System.out.println("A{" +
                "a=" + super.a +
                ", b=" + super.b +
                ", c=" + super.c +
                ", d=" + super.d +
                '}');
    }
}
