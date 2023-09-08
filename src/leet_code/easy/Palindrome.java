package leet_code.easy;

/**
 * leetcode.com/problems/find-first-palindromic-string-in-the-array
 */

public class Palindrome {

    public static void main(String[] args) {

        String[] words = {"ab", "ca", "ada", "df", "cac"};
        String s = firstPalindrome2(words);
        System.out.println(s);
        String s2 = firstPalindrome(words);
        System.out.println(s2);
    }

    private static String firstPalindrome(String[] words) {

        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }

        return "";
    }

    private static String firstPalindrome2(String[] words) {

        for (String word : words) {

            if (isPalindrome2(word)) {

                return word;
            }
        }

        return "";
    }

    private static boolean isPalindrome(String s) {

        for (int i = 0; i < s.length() / 2; i++) {

            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isPalindrome2(String s) {

        StringBuilder sb = new StringBuilder(s);
        String reverseString = sb.reverse().toString();
        return s.equals(reverseString);
    }
}