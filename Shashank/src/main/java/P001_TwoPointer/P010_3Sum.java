package src.main.java.P001_TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/3sum/description/
public class P010_3Sum {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            ArrayList<List<Integer>> finalRes = new ArrayList<>();
            Arrays.sort(nums);

            for (int k = 0; k < nums.length; k++) {

                if (nums[k] > 0)
                    break;

                if (k == 0 || nums[k] != nums[k - 1]) {
                    int i = k + 1, j = nums.length - 1;
                    while (i < j) {

                        int sum = nums[k] + nums[i] + nums[j];
                        if (sum == 0) {
                            finalRes.add(Arrays.asList(nums[k], nums[i++], nums[j--]));
                            while (i < j && nums[i] == nums[i - 1]) i++;
                            while (i < j && nums[j] == nums[j + 1]) j--;
                        } else if (sum > 0) {
                            j--;
                        } else {
                            i++;
                        }
                    }
                }

            }

            return finalRes;
        }
    }
}
