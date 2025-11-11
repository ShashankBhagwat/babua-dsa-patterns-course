package src.main.java.P001_TwoPointer;

// https://leetcode.com/problems/valid-palindrome-ii/description/
public class P004_Valid_Palindrome_II {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.validPalindrome("abbxa"));
    }

    static class Solution {
        public boolean validPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;

            while (left < right) {
                if (s.charAt(left) == s.charAt(right)) {
                    left++;
                    right--;

                } else {
                    return isValidPalindrome(left + 1, right, s) || isValidPalindrome(left, right - 1, s);
                }
            }
            return true;
        }

        public boolean isValidPalindrome(int left, int right, String s) {
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
}
