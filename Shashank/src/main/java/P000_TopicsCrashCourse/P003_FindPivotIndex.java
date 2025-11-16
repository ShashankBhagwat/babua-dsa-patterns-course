package src.main.java.P000_TopicsCrashCourse;

// https://leetcode.com/problems/find-pivot-index/description/
public class P003_FindPivotIndex {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    static class Solution {
        public int pivotIndex(int[] nums) {
            int sum = 0;
            int shortSum = 0;
            for (int num : nums) {
                sum = sum + num;
            }
            for (int i = 0; i < nums.length; i++) {
                if (sum - shortSum - nums[i] == shortSum) {
                    return i;
                }
                shortSum = shortSum + nums[i];
            }
            return -1;
        }
    }
}
