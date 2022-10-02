package stringHandling;

import java.util.StringTokenizer;

public class Demo8StringTokenizer {
    public static void main(String[] args) {
        String str = "welcome:to,cyber,success";
        StringTokenizer  stringTokenizer = new StringTokenizer(str,":");
        while (stringTokenizer.hasMoreElements()){
            System.out.println(stringTokenizer.nextElement());
        }
    }
}
