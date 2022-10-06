package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo6Desktop {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/sandeepbhingle/Desktop/fileHandling/abc.txt");
        System.out.println("File created in desktop folder "+file.createNewFile());
    }
}
