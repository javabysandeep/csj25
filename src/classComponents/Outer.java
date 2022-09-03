package classComponents;

//outer class cannot be static
public class Outer {
    int a = 100;
    static int b = 200;
    // nested class : non-static --> inner class
    class Inner {
        int c = 300;
//        static int var = 100;
//        static void display(){}
//        static class Nest{}
//        static {}

    }

    //nested class --> static nested class.
    static class NestedStatic {
        int d = 400;
        static int e = 500;
    }

    public static void main(String[] args) {
//        static int var = 100;
        // Local Inner class
        class LocalInner {
            int f = 600;
        }
//        static int a = 30; // CTE
//        static class Nest{}//CTE

    }
}
