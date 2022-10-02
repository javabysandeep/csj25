package stringHandling;

public class Demo3 {
    public static void main(String[] args) {
        String str = "        hello";
        str = str.concat(" world              ");
        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str);
        str = str.trim();
        System.out.println(str);

    }
}
