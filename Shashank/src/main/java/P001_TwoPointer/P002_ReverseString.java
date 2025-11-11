package src.main.java.P001_TwoPointer;

// https://leetcode.com/problems/reverse-string/description/
public class P002_ReverseString {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.reverseString("hello".toCharArray());
    }

    static class Solution {
        public void reverseString(char[] s) {
            int left = 0;
            int right = s.length - 1;

            while (left < right) {
                char temp = s[left];
                s[left++] = s[right];
                s[right--] = temp;
            }
        }
    }

}
