package exceptionhandling;

import java.io.FileNotFoundException;

public class Throwsdemo1 {
    void m1() throws FileNotFoundException {
        throw new FileNotFoundException("file not found");
    }

    void m2() throws FileNotFoundException {
        m1();
    }

    void m3() {
        try {
            m2();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Throwsdemo1 t1 = new Throwsdemo1();
        t1.m3();
    }
}
