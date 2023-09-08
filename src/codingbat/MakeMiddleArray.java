package codingbat;

import java.util.Arrays;

/**
 * Задача на массив Make Middle
 * https://codingbat.com/prob/p199519
 */

public class MakeMiddleArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2};
        int[] newArray = makeMiddle(array);
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] makeMiddle(int[] nums) {
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]};
    }
}
