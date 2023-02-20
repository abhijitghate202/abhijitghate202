package filehandling;

import java.io.*;

public class BufferedWriterReader {
    public static void main(String[] args) throws IOException {
        String filePath = "D://Java Intelli J//filehandling//Text101.txt";
        FileWriter fileWriter = new FileWriter(filePath);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Hello Everyone, ");
        bufferedWriter.write("\nMy name is Abhijit Ghate, ");
        bufferedWriter.write("\nI work in TCS,Pune.");
        bufferedWriter.close();

        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int n = bufferedReader.read();
        while (n > 0) {
            System.out.print((char) n);
            n = bufferedReader.read();
        }
        bufferedReader.close();
    }
}
