//Maximum Consecutive 1's

import java.util.Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println("---Maximum Consecutive Ones---");
        int[] nums = { 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0 };
        System.out.println("Array = " + Arrays.toString(nums));
        int maxcount = 0;
        int count = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count > maxcount)
                maxcount = count;
        }
        System.out.println("Output = " + maxcount);
    }
}
