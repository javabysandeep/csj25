package classComponents;

public class NestedClassTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println("outer instance var" + outer.a);
        System.out.println("Outer static var " + Outer.b);

        Outer.Inner inner = outer.new Inner();
        System.out.println("Inner class instance var " + inner.c);

        Outer.NestedStatic nestedStatic = new Outer.NestedStatic();
        System.out.println("Static nested instance var "+nestedStatic.d);


        System.out.println("Static nested class static var"+Outer.NestedStatic.e);

        //We can not access local inner class outside of the method.
//        System.out.println(f);
    }
}
