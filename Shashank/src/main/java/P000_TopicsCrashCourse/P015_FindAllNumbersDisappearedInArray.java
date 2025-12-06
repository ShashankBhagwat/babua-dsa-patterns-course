package src.main.java.P000_TopicsCrashCourse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class P015_FindAllNumbersDisappearedInArray {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }

    static class Solution {

        public List<Integer> findDisappearedNumbers(int[] nums) {
            int n = nums.length;

            for (int i = 0; i < n; i++) {
                int val = nums[i];
                if (val < 0)
                    val = -val;

                int index = val - 1;
                if (nums[index] > 0)
                    nums[index] = -nums[index];
            }

            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (nums[i] > 0)
                    result.add(i + 1);
            }

            return result;
        }

        public List<Integer> findDisappearedNumbers1(int[] nums) {
            HashSet<Integer> a = new HashSet<>();
            for (int i = 1; i <= nums.length; i++)
                a.add(i);

            for (int n : nums)
                a.remove(n);

            return a.stream().toList();
        }
    }
}
