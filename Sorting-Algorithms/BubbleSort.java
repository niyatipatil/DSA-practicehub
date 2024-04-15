import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // Bubble sort
        System.out.println("---Bubble Sort---");
        int[] arr = { 9, 8, 7, 6, 1, 5, 4, 3 };
        System.out.println("Initial Array : " + Arrays.toString(arr));
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = 1;
            while (right < arr.length) {
                if (arr[left] > arr[right]) {
                    // swap
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
                left++;
                right++;
            }
        }
        System.out.println("Sorted Array : " + Arrays.toString(arr));
        // System.out.println(arr[arr.length - 2]); // printing second highest number
    }
}
