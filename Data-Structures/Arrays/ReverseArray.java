//Reversing the elements of an array till our left value becomes greater than right.

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("---Reverse Array---");
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Initial Array = " + Arrays.toString(arr));
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed Array = " + Arrays.toString(arr));
    }

}
