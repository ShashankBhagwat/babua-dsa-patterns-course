package src.main.java.P001_TwoPointer;

import java.util.Arrays;

// https://leetcode.com/problems/squares-of-a-sorted-array/description/
public class P003_Squares_of_a_SortedArray {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.sortedSquares(new int[]{-7, -3, 2, 3, 11})));
    }

    static class Solution {
        public int[] sortedSquares(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            int resultIndex = nums.length - 1;
            int[] res = new int[nums.length];

            while (resultIndex >= 0) {
                int leftSquare = nums[left] * nums[left];
                int rightSquare = nums[right] * nums[right];

                if (leftSquare > rightSquare) {
                    res[resultIndex] = leftSquare;
                    left++;

                } else {
                    res[resultIndex] = rightSquare;
                    right--;
                }
                resultIndex--;
            }
            return res;
        }
    }
}
