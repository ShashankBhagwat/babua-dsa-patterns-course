package src.main.java.P000_TopicsCrashCourse;

// https://leetcode.com/problems/valid-mountain-array/description/
public class P009_ValidMountainArray {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.validMountainArray(new int[]{0, 3, 2, 1}));
    }

    static class Solution {
        public boolean validMountainArray1(int[] arr) {
            if (arr.length < 3)
                return false;

            int i = 0;
            while (i + 1 < arr.length && arr[i] < arr[i + 1]) i++;

            if (i == 0 || (i + 1 >= arr.length)) return false;

            while (i + 1 < arr.length && arr[i] > arr[i + 1]) i++;

            return i == arr.length - 2;
        }

        public boolean validMountainArray(int[] arr) {
            if (arr.length < 3)
                return false;

            int i = 0;
            boolean incline = true;
            while (i + 1 < arr.length) {
                if (incline) {
                    if (arr[i] < arr[i + 1])
                        i++;
                    else
                        incline = false;
                } else {
                    if (i == 0)
                        return false;

                    if (arr[i] > arr[i + 1])
                        i++;
                    else
                        return false;
                }
            }
            return !incline;
        }
    }
}
