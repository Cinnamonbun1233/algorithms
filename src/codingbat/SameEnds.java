package codingbat;

import java.util.Arrays;

/**
 * Задача Same Ends
 * https://codingbat.com/prob/p134300
 */

public class SameEnds {
    public static void main(String[] args) {
        int[] array = {5, 6, 45, 99, 13, 5, 6};
        System.out.println(sameEnds3(array, 2));
    }

    // сравнение в обратном порядке
    public static boolean sameEnds(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    // сравнение в прямом порядке
    public static boolean sameEnds2(int[] nums, int len) {
        int[] newArray1 = new int[len];
        int[] newArray2 = new int[len];

        for (int i = 0; i < len; i++) {
            newArray1[i] = nums[i];
            newArray2[i] = nums[nums.length - len + i];
        }

        return Arrays.equals(newArray1, newArray2);
    }

    public static boolean sameEnds3(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            if(nums[i] != nums[nums.length - len + i])
                return false;
        }
        return true;
    }
}