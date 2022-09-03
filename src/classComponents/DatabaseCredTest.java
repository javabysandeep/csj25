package classComponents;

public class DatabaseCredTest {
    public static void main(String[] args) {
        System.out.println("Mysql username "+Constants.MySql.username);
        System.out.println("Mysql password "+Constants.MySql.password);

        System.out.println("Oracle username "+Constants.Oracle.username);
        System.out.println("Oracle password "+Constants.Oracle.password);


        System.out.println("Posgress Dev username "+Constants.Posgress.Dev.username);
        System.out.println("Posgress Dev password "+Constants.Posgress.Dev.password);

        System.out.println("Posgress Prod username "+Constants.Posgress.Prod.username);
        System.out.println("Posgress Prod password "+Constants.Posgress.Prod.password);
    }
}
