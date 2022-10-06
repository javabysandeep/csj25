package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Demo16BufferedWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("grades.txt");
        FileWriter  fileWriter = new FileWriter(file,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        LocalDateTime startTime = LocalDateTime.now();
        for (int i = 0; i <10000000 ; i++) {
            bufferedWriter.write("welcome to file handling");
        }
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Time taken "+(startTime.getNano()-startTime.getNano()));
    }
}
