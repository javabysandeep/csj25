package exceptionHandling;

public class Demo14CheckExceptionPropagation {
    public static void main(String[] args){
        try {
            m1();
        } catch (Exception e) {
            System.out.println("handled in the main");
        }
        System.out.println("rest of the main");
    }

    private static void m1() throws Exception {
        m2();
    }
    static void m2() throws Exception {
      throw  new Exception();
    }
}
