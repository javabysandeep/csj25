package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("Ganesh.txt");
        System.out.println("Delete file "+file.delete());

        File folder = new File("Prakash");
        System.out.println("Delete Folder "+folder.delete());

    }
}








