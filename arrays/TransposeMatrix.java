package arrays;
//Converting rows of a matrix into columns and columns of a matrix into row is called transpose of a matrix

public class TransposeMatrix {
    public static void main(String[] args) {
        int original[][] = {{2, 4, 6}, {3, 6, 9}, {4, 8, 12}};

        int transpose[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = original[j][i];
            }
        }

        System.out.println("Before transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();//new line
        }
        System.out.println("After Transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();//new line
        }
    }
}
