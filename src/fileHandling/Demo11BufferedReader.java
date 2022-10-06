package fileHandling;

import java.io.*;
import java.time.LocalDateTime;

public class Demo11BufferedReader {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/sandeepbhingle/Desktop/fileHandling/abc.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        LocalDateTime startTime = LocalDateTime.now();
        int singleByte = bufferedReader.read();
        while (singleByte!=-1){
            // System.out.print((char) singleByte);
            singleByte = bufferedReader.read();
        }
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Time taken to read file "+(startTime.getSecond()-endTime.getSecond()));
    }
}
