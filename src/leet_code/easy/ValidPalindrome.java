package leet_code.easy;

/**
 * Задача о палиндроме Valid leet_code.easy.Palindrome
 * https://leetcode.com/problems/valid-palindrome
 */

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome3(s));
    }

    // Моё решение
    public static boolean isPalindrome1(String s) {
        String palindrome = s.toLowerCase().trim().replaceAll("[^A-Za-z0-9]", "");

        for (int i = 0; i < palindrome.length() / 2; i++) {
            if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // Второе решение
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        return findPalindrome(s);
    }

    private boolean findPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }

    // Продвинутое решение
    public static boolean isPalindrome3(String s) {
        int left = 0; // указатель на левый символ в строке
        int right = s.length() - 1; // указатель на правый символ в строке

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            // находим слева alphanumeric-символ
            while (!Character.isLetterOrDigit(leftChar) && left < right) {
                left++;
                leftChar = s.charAt(left);
            }

            // находим справа alphanumeric-символ
            while (!Character.isLetterOrDigit(rightChar) && left < right) {
                right--;
                rightChar = s.charAt(right);
            }

            // если символы не равны или указатели пересеклись, то false
            if (left > right || Character.toLowerCase(leftChar) !=
                    Character.toLowerCase(rightChar)) { // здесь нужно без регистра сравнить
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}