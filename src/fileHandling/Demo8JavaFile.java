package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo8JavaFile {
    public static void main(String[] args) throws IOException {
        File file = new File("App.java");
        System.out.println(file.createNewFile());

        FileInputStream fileInputStream =new FileInputStream(file);
        int singleByte = fileInputStream.read();
        while (singleByte!=-1){
            System.out.print((char)singleByte);
            singleByte = fileInputStream.read();
        }
    }
}
