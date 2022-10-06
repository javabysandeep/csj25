package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo5ListOfFiles {
    public static void main(String[] args) throws IOException {
        File file = new File("src/array");
        System.out.println(file.isDirectory());
        File[] files = file.listFiles();
        System.out.println("Number of files "+files.length);
        for (File temp:files) {
            System.out.println("File name = "+temp.getName()+"\t"+" Length = "+temp.length());

        }
    }
}








