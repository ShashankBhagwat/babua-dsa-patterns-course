package src.main.java.P001_TwoPointer;

import java.util.Arrays;

public class P011_SortTwoColors {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.sort2Colors(new int[]{0, 1, 1, 1, 0, 0, 1, 1})));
    }

    static class Solution {

        private void swapNumbers(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        public int[] sort2Colors(int[] nums) {
            int i = 0, j = nums.length - 1;

            while (i < j) {
                if (nums[i] == 0) {
                    i++;
                } else {
                    swapNumbers(nums, i, j);
                    j--;
                }
            }
            return nums;
        }
    }
}
