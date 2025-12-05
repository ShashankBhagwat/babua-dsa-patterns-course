package src.main.java.P000_TopicsCrashCourse;

import java.util.Arrays;

// https://leetcode.com/problems/move-zeroes/description/
public class P011_MoveZeroes {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.moveZeroes(new int[]{1, 0, 3, 2, 0});
    }

    static class Solution {
        public void moveZeroes1(int[] nums) {
            int slow = 0, fast = 0, n = nums.length;

            while (fast < n) {
                if (nums[fast] != 0)
                    nums[slow++] = nums[fast];

                fast++;
            }

            while (slow < n) nums[slow++] = 0;

            System.out.println(Arrays.toString(nums));
        }

        public void moveZeroes(int[] nums) {
            int slow = 0, fast = 0, n = nums.length;

            while (fast < n) {
                if (nums[fast] != 0) {
                    int temp = nums[fast];
                    nums[fast] = nums[slow];
                    nums[slow++] = temp;
                }

                fast++;
            }

            System.out.println(Arrays.toString(nums));
        }
    }

}
