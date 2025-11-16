package src.main.java.P001_TwoPointer;

import java.util.*;

// https://leetcode.com/problems/two-sum/description/
public class P008_TwoSum {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.twoSum(new int[]{3,2,4}, 6)));
    }

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] res = new int[2];
            int i = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            while (i < nums.length) {
                int difference = target - nums[i];
                if (map.containsKey(difference)) {
                    res[0] = map.get(difference);
                    res[1] = i;
                    return res;
                } else {
                    map.put(nums[i], i);
                    i++;
                }
            }
            return res;
        }
    }
}
