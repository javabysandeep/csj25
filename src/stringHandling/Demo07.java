package stringHandling;

public class Demo07 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("welcome to string handling to");
        StringBuffer stringBuffer = new StringBuffer();
        String str = new String(stringBuffer);

        String str2 = new String(stringBuilder);
        String str3 = new String(stringBuffer);

        StringBuilder sb1 = new StringBuilder(str);
        StringBuilder sb2 = new StringBuilder(stringBuffer);


        StringBuffer stringBuffer1 = new StringBuffer(str);
        StringBuffer stringBuffer2 = new StringBuffer(stringBuilder);

        System.out.println("ABC".equalsIgnoreCase("abc"));

        String greet = "good morning";
        String substring = greet.substring(0,4);
        System.out.println(substring);

    }

}
