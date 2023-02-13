package filehandling;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        try {
            if (file.createNewFile()){
                System.out.println("File already Exists");
            }else {
                System.out.println("File Created");
                System.out.println("File Name "+file.getName());
                System.out.println("Absolute Path "+file.getAbsolutePath());
                System.out.println("is");
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
