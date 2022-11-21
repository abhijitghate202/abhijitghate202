package arrays;

public class ArrayDemo2 {
    static void printArray(int[] arr) {
        for (int j : arr) System.out.println(j);
    }

    public static void main(String[] args) {
        printArray(new int[]{5, 10, 15, 20});
    }
}
