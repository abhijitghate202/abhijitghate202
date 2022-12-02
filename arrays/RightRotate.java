package arrays;

public class RightRotate {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50};
        //n = rotation
        int n = 1;

        System.out.println("The Original array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < n; i++) {
            int j, last;
            last = arr[arr.length - 1];

            for (j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        System.out.println();

        System.out.println(" The array after right rotation : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
