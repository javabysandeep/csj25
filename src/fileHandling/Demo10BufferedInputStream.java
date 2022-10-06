package fileHandling;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

public class Demo10BufferedInputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/sandeepbhingle/Desktop/fileHandling/abc.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        LocalDateTime startTime = LocalDateTime.now();
        int singleByte = bufferedInputStream.read();
        while (singleByte != -1) {
            singleByte = bufferedInputStream.read();
        }
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Time Taken to read "+(startTime.getSecond()-endTime.getSecond()));
    }
}
