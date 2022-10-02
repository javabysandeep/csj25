package stringHandling;

public class Demo5 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = "abc";
        String str3 = str2;
        String str4 = new String("abc");
        str1.toUpperCase();
        str2.toUpperCase();
        str3.toUpperCase();
        str4.toUpperCase();

    }
}
