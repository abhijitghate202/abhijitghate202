package exceptionhandling;

import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionDemo {
    public static void main(String[] args) {
        try {
            PrintWriter printwriter = new PrintWriter("input.txt");
            printwriter.print("Welcome");
            printwriter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("File Saved");
    }
}
