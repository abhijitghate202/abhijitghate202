package arrays;

import java.util.Scanner;

public class MultiDimentionalarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];

        System.out.println("Enter First matrix element");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Second matrix Element");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Addition of Two Matrices \n");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
