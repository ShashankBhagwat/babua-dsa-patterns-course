package src.main.java.P000_TopicsCrashCourse;

import java.util.*;

// https://leetcode.com/problems/height-checker/description/
public class P013_HeightChecker {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.heightChecker(new int[]{5,1,2,3,4}));
    }

    static class Solution {
        public int heightChecker(int[] heights) {
            ArrayList<Integer> s = new ArrayList();
            for (Integer h : heights) {
                s.add(h);
            }
            Collections.sort(s);

            int count = 0;

            for (int i = 0; i < heights.length; i++)
                if (heights[i] != s.get(i))
                    count++;

            return count;
        }
    }
}
