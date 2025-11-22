package src.main.java.P001_TwoPointer;

// https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/description/
public class P015_AppendCharactersToStringToMakeSubsequence {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.appendCharacters("coaching", "ding"));
    }

    static class Solution {
        public int appendCharacters(String s, String t) {
            int i = 0, j = 0;
            int tLength = t.length();

            while (i < tLength && j < s.length()) {
                if (t.charAt(i) == s.charAt(j++))
                    i++;
            }

            return tLength - i;
        }
    }
}
