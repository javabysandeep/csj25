package stringHandling;

public class Dem06 {
    public static void main(String[] args) {
        String string1 = new String("abc");
        String string2 = "abc";

      /*  StringBuilder stringBuilder = "abc";
        StringBuffer  stringBuffer = "abc";*/

        StringBuilder stringBuilder = new StringBuilder("hello");
        stringBuilder.append(" world");
        System.out.println(stringBuilder);
        stringBuilder.delete(0,5);
        System.out.println(stringBuilder);
        stringBuilder.insert(0,"hhhhhhhhhh");
        System.out.println(stringBuilder);


    }
}
