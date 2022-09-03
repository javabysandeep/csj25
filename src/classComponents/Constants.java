package classComponents;

public class Constants {
    static class MySql {
        static String username = "Mysql";
        static String password = "admin123";
    }

    static class Oracle {
        static String username = "Oracle";
        static String password = "admin123";
    }

    static class Posgress{
        static class Dev{
            static String username = "dev";
            static String password = "dev123";
        }

        static class Prod{
            static String username = "prod";
            static String password = "prod@1234";
        }
    }
}
