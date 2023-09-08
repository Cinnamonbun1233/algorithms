package leet_code.easy;

/**
 * Задача leet_code.easy.Palindrome Number
 * https://leetcode.com/problems/palindrome-number/
 */

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}