package exceptionHandling;

public class Demo10 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            System.out.println("Message "+e.getMessage());
            System.out.println("handled in the main");
        }
        System.out.println("rest of the main");
    }

    static void m1() throws Exception {
        m2();
    }

    static void m2() throws Exception {
        m3();
    }

    static void m3()  throws Exception {
        throw new Exception("custom message");
    }
}
