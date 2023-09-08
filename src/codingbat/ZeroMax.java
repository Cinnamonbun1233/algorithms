package codingbat; /**
 * Задача на массив
 * https://codingbat.com/prob/p187050
 */

import java.util.Arrays;

public class ZeroMax {

    public static void main(String[] args) {
        int[] ints = zeroMax(new int[]{0, 5, 0, 3});
        System.out.println(Arrays.toString(ints));
    }

    private static int[] zeroMax(int[] nums) {
        int maxOdd = Integer.MIN_VALUE;
        boolean wasOdd = false;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 != 0) {
                maxOdd = Math.max(nums[i], maxOdd);
                wasOdd = true;
            }

            if (nums[i] == 0 && wasOdd) {
                nums[i] = maxOdd;
            }
        }
        return nums;
    }
}