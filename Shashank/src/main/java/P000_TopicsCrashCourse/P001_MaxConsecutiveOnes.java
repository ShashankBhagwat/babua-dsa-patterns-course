package src.main.java.P000_TopicsCrashCourse;

// https://leetcode.com/problems/max-consecutive-ones/description/
public class P001_MaxConsecutiveOnes {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.findMaxConsecutiveOnes(new int[]{1, 1, 0, 0, 1, 1, 1}));
    }

    static class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int count = 0;
            int max = 0;
            int index = 0;
            while (index < nums.length) {
                count = (nums[index++] == 1) ? count + 1 : 0;
                if (count > max)
                    max = count;
            }
            return max;
        }
    }
}
