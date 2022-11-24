package arrays;

public class SumofAllitemsinArray {
    public static void main(String[] args) {
        int[] array = new int[]{10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum of All Items in Array is : " + sum);
    }
}
