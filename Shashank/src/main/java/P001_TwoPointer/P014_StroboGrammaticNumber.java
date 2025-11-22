package src.main.java.P001_TwoPointer;

import java.util.HashMap;

// https://leetcode.com/problems/strobogrammatic-number/description/
//        A strobogrammatic number is a number that looks the same when rotated 180 degrees (turned upside down).
//        Only certain digits remain valid when rotated:
//
//        Digit	Rotates To
//        0	0
//        1	1
//        6	9
//        8	8
//        9	6

public class P014_StroboGrammaticNumber {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isValidNum("198861"));

    }

    static class Solution {
        public boolean isValidNum(String num) {

            HashMap<Character, Character> map = new HashMap<>();
            map.put('0', '0');
            map.put('1', '1');
            map.put('6', '9');
            map.put('8', '8');
            map.put('9', '6');

            int i = 0, j = num.length() - 1;
            while (i <= j) {
                char l = num.charAt(i);
                char r = num.charAt(j);

                if (map.containsKey(l)) {
                    if (map.get(l) != r) {
                        return false;
                    } else {
                        i++;
                        j--;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
    }
}
