package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        // by creating File class object does not mean file is created.
        File file = new File("Akash.txt");

        //to create new file
        boolean fileCreated = file.createNewFile();
        System.out.println("File created "+fileCreated);

        //create a folder
        File folder = new File("Prakash");
        boolean folderCreated = folder.mkdir();
        System.out.println("Folder created "+folderCreated);

    }
}








