package src.main.java.P000_TopicsCrashCourse;

// https://leetcode.com/problems/duplicate-zeros/description/
public class P005_DuplicateZeros {

    public static void main(String[] args) {

        Solution s = new Solution();
        s.duplicateZeros(new int[]{8, 4, 5, 0, 0, 0, 0, 7});
    }

    static class Solution {
        public void duplicateZeros(int[] arr) {
            int n = arr.length;
            int zeros = 0;

            for (int k : arr)
                if (k == 0)
                    zeros++;

            int i = n - 1;
            int j = n - 1 + zeros;

            while (i < j) {
                if (arr[i] != 0) {
                    if (j < n)
                        arr[j] = arr[i];
                } else {
                    if (j < n)
                        arr[j] = 0;
                    j--;

                    if (j < n)
                        arr[j] = 0;
                }
                i--;
                j--;
            }
        }
    }
}