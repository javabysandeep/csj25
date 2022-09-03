package classComponents;

public class City {

    class Colony{
        int colonyId = 100;
        String colonyName = "FC road";
    }

    static class Corporation {
        String name = "Pune Corp";
        static String cityCorp = "City corp";
    }

    public static void main(String[] args) {
        class Local{
            int local = 100;
        }
        Local local = new Local();
        System.out.println(local.local);
    }
}
