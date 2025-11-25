package src.main.java.P002_FastSlowPointer;

// https://leetcode.com/problems/find-the-duplicate-number/description/
public class P007_FindDuplicateNumber {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.findDuplicate(new int[]{2, 5, 9, 6, 9, 3, 8, 9, 7, 1}));
    }

    static class Solution {
        public int findDuplicate(int[] nums) {
            int slow = 0, fast = 0;

            do {
                slow = nums[slow];
                fast = nums[nums[fast]];
            } while (slow != fast);

            int n1 = 0, n2 = slow;

            while (n1 != n2) {
                n1 = nums[n1];
                n2 = nums[n2];
            }
            return n1;
        }
    }
}
