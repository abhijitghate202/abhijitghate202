package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String filePath = "D://Java Intelli J//filehandling//Welcome.txt";
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            String msg = "Welcome to the java World!!!";
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
