package exceptionHandling;

public class Demo5 {
    public static void main(String[] args) {

       try {
           System.out.println("try");
           System.exit(0);
       }finally {
           System.out.println("finally");
       }
        System.out.println("rest of the code");
    }
}
