package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        File file = new File("Akash.txt");
        System.out.println("File created "+ file.createNewFile());

        System.out.println("Length of the file "+file.length());

        //is it file or folder
        System.out.println("Its file "+file.isFile());
        System.out.println("Its Folder "+file.isDirectory());

        //get path: complete
        System.out.println("File complete path "+file.getAbsolutePath());//complete path


        //relative path: same folder
        System.out.println("File relative path "+file.getPath());



    }
}








