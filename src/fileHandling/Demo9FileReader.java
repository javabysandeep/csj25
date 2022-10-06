package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Demo9FileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/sandeepbhingle/Desktop/fileHandling/abc.txt");
        FileReader fileReader = new FileReader(file);
        int singleByte = fileReader.read();
        while (singleByte != -1) {
            System.out.print((char)singleByte);
            singleByte = fileReader.read();

        }

    }
}
