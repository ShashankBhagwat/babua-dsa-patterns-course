package src.main.java.P001_TwoPointer;

import java.util.Arrays;

// https://leetcode.com/problems/squares-of-a-sorted-array/description/
public class P003_Squares_of_a_SortedArray {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.sortedSquares(new int[]{-5, -3, -2, -1})));
    }

    static class Solution {
        public int[] sortedSquares(int[] nums) {
            int left = 0, resIndex = nums.length - 1, right = nums.length - 1;
            int[] res = new int[nums.length];

            while (resIndex >= 0) {
                int iVal = nums[left] * nums[left];
                int jVal = nums[right] * nums[right];

                if (iVal > jVal) {
                    res[resIndex] = iVal;
                    left++;

                } else {
                    res[resIndex] = jVal;
                    right--;
                }
                resIndex--;
            }

            return res;
        }
    }
}
