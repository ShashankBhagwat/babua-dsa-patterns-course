package src.main.java.P000_TopicsCrashCourse;

// https://leetcode.com/problems/third-maximum-number/description/
public class P014_ThirdMaximumNumber {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.thirdMax(new int[]{1, 1, 2}));
    }

    static class Solution {
        public int thirdMax(int[] nums) {

            if (nums.length == 1) return nums[0];
            if (nums.length == 2) return Math.max(nums[0], nums[1]);
            long first = Long.MIN_VALUE, second = Long.MIN_VALUE, third = Long.MIN_VALUE;

            for (int num : nums) {
                if (num == first || num == second || num == third)
                    continue;

                if (num > first) {
                    third = second;
                    second = first;
                    first = num;
                } else if (num > second) {
                    third = second;
                    second = num;
                } else if (num > third) {
                    third = num;
                }
            }

            if (third == Long.MIN_VALUE) return (int) first;
            return (int) third;
        }
    }
}
