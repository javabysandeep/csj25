package controlStatements;

public class IfElse {
    public static void main(String[] args) {
        if(IfElse.isEmpty()){
            System.out.println("if if is true");
            System.out.println("if if is true");
        }
       // System.out.println("no independents are allowed between if and else");
        else{
            System.out.println("else block false");
        }
        System.out.println("rest of the code");

    }

    private static boolean isEmpty() {
        return false;
    }

}
