package arrays;

public class EvenPosition {
    public static void main(String[] args) {
        int[] array= new int[]{150,200,300,350,400,550};
        for (int i=1;i< array.length;i=i+2){
            System.out.println("Array's Element present on Even position : " + array[i]);
        }
    }
}
