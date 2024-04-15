import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // Selection Sort
        System.out.println("---Selection Sort---");
        int[] arr = { 9, 5, 25, 53, 1, -5 };
        System.out.println("Initial Array : " + Arrays.toString(arr));
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            // int min = 999999;
            int min = Integer.MAX_VALUE; // Instead of assigning a very large number like 99999, we use
                                         // Integer.MIN_VALUE to initialize the minimum value.
            int minIndex = 0;
            for (int j = i; j < size; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            // swapping the elements
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
}
