package src.main.java.P000_TopicsCrashCourse;

import java.util.HashSet;

// https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
public class P008_CheckIfNAndItsDoubleExist {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.checkIfExist(new int[]{7, 1, 14, 11}));
    }

    static class Solution {
        public boolean checkIfExist(int[] arr) {
            HashSet<Integer> set = new HashSet<>();
            for (int a : arr) {
                if (set.contains(a * 2))
                    return true;

                if (a % 2 == 0 && set.contains(a / 2))
                    return true;

                set.add(a);
            }

            return false;
        }
    }
}
