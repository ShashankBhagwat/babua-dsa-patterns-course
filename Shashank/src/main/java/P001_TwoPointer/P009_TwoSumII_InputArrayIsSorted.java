package src.main.java.P001_TwoPointer;

import java.util.Arrays;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class P009_TwoSumII_InputArrayIsSorted {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.twoSum(new int[]{-1, 0}, -1)));
    }

    static class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int[] res = new int[2];
            int i = 0, j = numbers.length - 1;
            while (i < j) {
                int sum = numbers[i] + numbers[j];
                if (sum > target) {
                    j--;
                } else if (sum < target) {
                    i++;
                } else {
                    res[0] = i + 1;
                    res[1] = j + 1;
                    return res;
                }
            }
            return res;
        }
    }
}
