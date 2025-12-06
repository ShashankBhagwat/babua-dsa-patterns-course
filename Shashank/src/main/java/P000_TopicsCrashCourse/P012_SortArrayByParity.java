package src.main.java.P000_TopicsCrashCourse;

import java.util.Arrays;

// https://leetcode.com/problems/sort-array-by-parity/description/
public class P012_SortArrayByParity {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.sortArrayByParity(new int[]{3, 1, 2, 4})));
    }

    static class Solution {
        public int[] sortArrayByParity(int[] nums) {
            int i = 0, j = nums.length - 1, n = nums.length;
            while (i < j) {
                if (nums[i] % 2 == 0) {
                    i++;
                } else {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j--;
                }
            }

            return nums;
        }
    }
}
