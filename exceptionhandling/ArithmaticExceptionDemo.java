package exceptionhandling;

import java.util.Scanner;

public class ArithmaticExceptionDemo {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println(5 / s1.nextInt());
    }
}
