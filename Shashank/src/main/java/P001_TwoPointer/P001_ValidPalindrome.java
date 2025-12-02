package src.main.java.P001_TwoPointer;

// https://leetcode.com/problems/valid-palindrome/
public class P001_ValidPalindrome {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }

    static class Solution {
        public boolean isPalindrome(String s) {
            int i = 0, j = s.length() - 1;

            while (i < j) {
                if (!Character.isLetterOrDigit(s.charAt(i))) {
                    i++;
                    continue;
                }

                if (!Character.isLetterOrDigit(s.charAt(j))) {
                    j--;
                    continue;
                }

                if (Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--)))
                    return false;

            }

            return true;
        }
    }

}

