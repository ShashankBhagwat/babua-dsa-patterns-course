package src.main.java.P000_TopicsCrashCourse;

import java.util.Arrays;

// https://leetcode.com/problems/remove-element/description/
public class P006_RemoveElement {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.removeElement(new int[]{3, 2, 2, 3}, 3));
    }

    static class Solution {
        public int removeElement(int[] nums, int val) {
            int i = 0;
            int j = nums.length - 1;

            while (j >= 0 && nums[j] == val) {
                nums[j--] = -1;
            }

            while (i <= j) {
                if (nums[i] == val) {
                    nums[i] = nums[j];
                    nums[j] = -1;
                    j--;
                }
                i++;
                while (j >= 0 && nums[j] == val) {
                    nums[j--] = -1;
                }
            }

            int count = 0;
            for (int num : nums) {
                if (num != -1)
                    count++;
            }

            System.out.println(Arrays.toString(nums));  // [2, 2, -1, -1]
            return count;
        }
    }
}
