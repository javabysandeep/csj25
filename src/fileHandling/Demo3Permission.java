package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo3Permission {
    public static void main(String[] args) throws IOException {
        File file = new File("Akash.txt");
        System.out.println("File created "+ file.createNewFile());

        boolean canExecute = file.canExecute();
        System.out.println("Can execute "+ file.canExecute());
        System.out.println("Can Write "+ file.canWrite());
        System.out.println("Can Read "+ file.canRead());

        //change the permissin

        file.setWritable(false);
        file.setReadable(false);

    }
}








