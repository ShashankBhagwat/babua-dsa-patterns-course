package src.main.java.P001_TwoPointer;

import java.util.Arrays;

// https://leetcode.com/problems/sort-colors/description/
public class P012_SortThreeColors {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.sortColors(new int[]{2,0,2,1,1,0});
    }

    static class Solution {

        private void swapNumbers(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        public void sortColors(int[] nums) {
            int i = 0, k = 0, j = nums.length - 1;

            while (k <= j) {

                if (nums[k] > 1) {
                    swapNumbers(nums, k, j);
                    j--;
                } else if (nums[k] < 1) {
                    swapNumbers(nums, i, k);
                    i++;
                    k++;
                } else {
                    k++;
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }
}
