package fileHandling;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;

public class Demo14BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("marks.txt");
        System.out.println(file.createNewFile());
        // FileOutputStream, BufferedOutputStream, FileWrite, BufferedWriter
        LocalDateTime startTime = LocalDateTime.now();
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        for (int i = 1; i <10000000 ; i++) {
            bufferedOutputStream.write('A');
        }
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Write complete and time taken is "+ (endTime.getSecond()-startTime.getSecond()));
    }
}
