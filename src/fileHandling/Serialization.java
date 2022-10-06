package fileHandling;

import java.io.*;

public class Serialization {
    public static void main(String[] args) throws IOException {
        Student student = new Student(1, "akash","Password");
        File file = new File("akash101.txt");
        file.createNewFile();

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(student);
        System.out.println("Object stored or serialzied ");

    }
}
