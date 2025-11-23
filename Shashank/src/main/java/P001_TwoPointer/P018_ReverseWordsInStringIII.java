package src.main.java.P001_TwoPointer;

// https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class P018_ReverseWordsInStringIII {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reverseWords("Let's take LeetCode contest"));
    }

    static class Solution {
        public String reverseWords(String s) {
            StringBuilder reverse = new StringBuilder();
            StringBuilder word = new StringBuilder();
            int i = 0;

            while (i < s.length()) {
                if (s.charAt(i) == ' ') {
                    reverse.append(word.reverse()).append(" ");
                    word.setLength(0);
                } else {
                    word.append(s.charAt(i));
                }
                i++;
            }

            if(!word.isEmpty())
                reverse.append(word.reverse());

            return reverse.toString();
        }
    }
}
