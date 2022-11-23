package arrays;

public class SmallestElement {
    public static void main(String[] args) {
        int[] array = new int[]{150, 200, 300, 350, 400, 550};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("Smallest Element in an Array : " + min);
    }
}
