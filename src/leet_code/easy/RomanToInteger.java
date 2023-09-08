package leet_code.easy;

/**
 * Задача Roman to Integer
 * https://leetcode.com/problems/roman-to-integer/
 */

public class RomanToInteger {
    public static void main(String[] args) {
        String str = "LVIII";
        int a = romanToInt(str);
        System.out.println(a);
    }

    public static int romanToInt(String s) {
        int ans = 0, num = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I' -> num = 1;
                case 'V' -> num = 5;
                case 'X' -> num = 10;
                case 'L' -> num = 50;
                case 'C' -> num = 100;
                case 'D' -> num = 500;
                case 'M' -> num = 1000;
            }
            if (4 * num < ans) {
                ans -= num;
            } else {
                ans += num;
            }
        }
        return ans;
    }
}