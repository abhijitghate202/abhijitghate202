package arrays;

public class OddPosition {
    public static void main(String[] args) {
        int[] array = new int[]{150, 200, 300, 350, 400, 550};
        for (int i = 0; i < array.length; i = i + 2) {
            System.out.println("Array's Element present on Odd Position : " + array[i]);
        }
    }
}
