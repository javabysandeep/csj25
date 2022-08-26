package classComponents;

public class StaticVariable {
    static int variable;// static primitive variable.

    public static void main(String[] args) {
        //static int a= 100;
       // int variable = 100;
        System.out.println(StaticVariable.variable);//0
        System.out.println(variable);//100
    }
}
