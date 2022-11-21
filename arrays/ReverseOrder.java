package arrays;

//Reverse Order of elements of an array

public class ReverseOrder {
    public static void main(String[] args) {
        int[] array = new int[]{10, 20, 30, 40, 50};
        System.out.print("Original Order Of an Array : ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.print("Reverse Order Of the Array : ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
