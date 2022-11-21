package arrays;

//Program to print the duplicate elements of an array

public class DuplicateElements {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 10, 2, 7, 3, 8, 9, 6};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    System.out.println("Duplicate elements in array : " + array[j]);
            }
        }
    }
}
