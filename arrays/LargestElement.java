package arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] array = new int[]{150, 200, 300, 350, 400, 550};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("Largest Element in array : " + max);
    }
}
