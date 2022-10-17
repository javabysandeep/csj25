package collectionFramework.listImplementations;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class WrapperDemo {
    public static void main(String[] args) {
        int a = 30;
        String number = "123";
        m1(a);
        System.out.println(Integer.toHexString(a));
        int i = Integer.parseInt(number);
        System.out.println(i);
        float fl = 15.6f;
        int i1 = new Integer("123");//auto-unboxing
        Integer i2 = i1;//auto-boxing
        // methods are provided:
        //to convert decimal into octal, binary, hexadecimal
        // to convert string into primitive int

        byte b = Byte.parseByte("123");

        Byte aByte = Byte.valueOf("123");
        Short aShort = Short.valueOf("123");
        Integer integer = Integer.valueOf("123");
        Long aLong = Long.valueOf("123");
        Float aFloat = Float.valueOf("123");
        Double aDouble = Double.valueOf("123");
    }

    private static void m1(int a) {
    }
}
