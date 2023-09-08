package leet_code.easy;

import java.util.Arrays;

/**
 * leetcode.com/problems/longest-common-prefix
 */

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] array = {"dog", "racecar", "car"};
        String result = LongestCommonPrefix.longestCommonPrefix(array);
        System.out.println(result);
    }

    public static String longestCommonPrefix(String[] s) {

        Arrays.sort(s);
        String s1 = s[0];
        String s2 = s[s.length - 1];
        int index = 0;

        while (index < s1.length() && index < s2.length()) {

            if (s1.charAt(index) == s2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }

        return s1.substring(0, index);
    }
}