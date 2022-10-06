package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

public class Demo7FileInputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/sandeepbhingle/Desktop/fileHandling/abc.txt");

        // to read from the file
        //1. FileInputStream
        //2. BufferedInputStream
        //3. FileReader
        //4. BufferedReader

        FileInputStream fileInputStream = new FileInputStream(file);
        LocalDateTime startTime = LocalDateTime.now();
        int singleByte = fileInputStream.read();
        while (singleByte != -1) {
           // System.out.print((char)singleByte);
            singleByte = fileInputStream.read();
        }
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Time Taken to read "+(startTime.getNano()-endTime.getNano()));
    }
}
