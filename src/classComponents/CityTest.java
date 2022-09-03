package classComponents;

public class CityTest {
    public static void main(String[] args) {
        City city = new City();
        City.Colony colony = city.new Colony();

        System.out.println(colony.colonyId + "\t" + colony.colonyName);

        City.Corporation corporation = new City.Corporation();

        System.out.println(corporation.name);
        System.out.println(City.Corporation.cityCorp);
    }
}
