package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

public class Demo15 {
    public static void main(String[] args) throws IOException {
        File file = new File("grades.txt");
        FileWriter  fileWriter = new FileWriter(file);
        LocalDateTime startTime = LocalDateTime.now();
        for (int i = 0; i <10000000 ; i++) {
            fileWriter.write("welcome to file handling");
        }
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Time taken "+(startTime.getNano()-startTime.getNano()));
    }
}
