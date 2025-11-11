package src.main.java.P001_TwoPointer;

// https://leetcode.com/problems/valid-palindrome/
public class P001_ValidPalindrome{

    public static void main(String[]args){
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }

    static class Solution {
        public boolean isPalindrome(String s) {
            int lowerIndex = 0, upperIndex = s.length() - 1;

            while (lowerIndex < upperIndex) {

                if (!Character.isLetterOrDigit(s.charAt(lowerIndex))) {
                    lowerIndex++;
                    continue;
                }

                if (!Character.isLetterOrDigit(s.charAt(upperIndex))) {
                    upperIndex--;
                    continue;
                }

                if (Character.toLowerCase(s.charAt(lowerIndex)) != Character.toLowerCase(s.charAt(upperIndex))) {
                    return false;
                }

                lowerIndex++;
                upperIndex--;
            }

            return true;
        }
    }

}

