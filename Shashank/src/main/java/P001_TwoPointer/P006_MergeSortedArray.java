package src.main.java.P001_TwoPointer;

import java.util.Arrays;

// https://leetcode.com/problems/merge-sorted-array/description/
public class P006_MergeSortedArray {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.merge(new int[]{2,2,3,0,0,0,0}, 3, new int[]{1,5,6,7}, 4);
    }

    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {

            int i = m - 1, j = n - 1, k = m + n - 1;

            while (j >= 0 && i >= 0) {
                nums1[k--] = (nums2[j] > nums1[i]) ? nums2[j--] : nums1[i--];
            }

            while (j >= 0) {
                nums1[k--] = nums2[j--];
            }

            System.out.println(Arrays.toString(nums1));
        }
    }
}
