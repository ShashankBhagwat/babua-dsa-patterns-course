package src.main.java.P001_TwoPointer;

// https://leetcode.com/problems/reverse-words-in-a-string/description/
public class P017_ReverseWordsInString {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reverseWords("a good   example"));
    }

    static class Solution {
        public String reverseWords(String s) {
            int left = 0, right = s.length() - 1;

            while (left <= right && s.charAt(left) == ' ') left++;
            while (right >= left && s.charAt(right) == ' ') right--;

            StringBuilder result = new StringBuilder();
            StringBuilder word = new StringBuilder();

            while (right >= left) {
                char c = s.charAt(right);

                if (c != ' ') {
                    word.append(c);
                } else if (word.length() > 0) {
                    result.append(word.reverse()).append(" ");
                    word.setLength(0);
                }
                right--;
            }

            if (word.length() > 0) {
                result.append(word.reverse());
            }

            return result.toString();
        }
    }
}
