package leet_code.easy; /**
 * Задача Two Sum
 * https://leetcode.com/problems/two-sum/
 */

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int[] result = twoSum(array, 9);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    break;
                }
                if (nums[i] + nums[j] == target) {
                    return new int[]{j, i};
                }
            }
        }
        return null;
    }
}