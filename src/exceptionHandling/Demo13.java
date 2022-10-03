package exceptionHandling;

public class Demo13 {
    public static void main(String[] args) {
       try{
           m1();
       }catch (Exception exception){
           System.out.println("exception propagation");
       }
        System.out.println("rest of the main");
    }

    private static void m1() {
        m2();
    }
    static void m2(){
        System.out.println(10/0);
    }
}
