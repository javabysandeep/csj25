package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo12 {
    public static void main(String[] args) throws IOException {
        File file  = new File("akshay.txt");
        System.out.println(file.createNewFile());
        file.setWritable(false);
    }
}
