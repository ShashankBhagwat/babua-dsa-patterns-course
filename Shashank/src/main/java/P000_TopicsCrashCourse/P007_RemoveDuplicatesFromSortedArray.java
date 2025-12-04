package src.main.java.P000_TopicsCrashCourse;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class P007_RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

//    Input: nums = [0,0,1,1,1,2,2,3,3,4]
//    Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

    static class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length <= 1)
                return nums.length;

            int k = 1; // write index

            for (int j = 1; j < nums.length; j++) {
                if (nums[j] != nums[j - 1]) {
                    nums[k++] = nums[j];
                }
            }

            return k;
        }


    }
}
