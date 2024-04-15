//Find the difference between the highest and the lowest element of an array

import java.util.Arrays;

public class DifferenceHighestLowest {
    public static void main(String[] args) {
        System.out.println("---Difference between highest & lowest elements---");
        int[] arr = { 20, 10, 30, 40, 50, 100 };
        System.out.println("Array = " + Arrays.toString(arr));
        int highest = Integer.MIN_VALUE;
        int lowest = arr[0];

        for (int element : arr) {
            if (element > highest) {
                highest = element;
            }
            if (element < lowest) {
                lowest = element;
            }
        }
        int difference = highest - lowest;
        System.out.println("The difference between the highest & the lowest element of an array is " + difference);
    }
}
