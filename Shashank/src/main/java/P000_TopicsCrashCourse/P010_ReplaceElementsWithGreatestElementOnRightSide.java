package src.main.java.P000_TopicsCrashCourse;

import java.util.Arrays;

// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/
public class P010_ReplaceElementsWithGreatestElementOnRightSide {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.replaceElements(new int[]{17, 18, 5, 4, 6, 1})));
    }

    static class Solution {

        public int[] replaceElements(int[] arr) {
            int maxSoFar = -1;

            for (int i = arr.length - 1; i >= 0; i--) {
                int current = arr[i];
                arr[i] = maxSoFar;
                if (current > maxSoFar) {
                    maxSoFar = current;
                }
            }

            return arr;
        }

        public int[] replaceElements1(int[] arr) {
            int maxNumber = -1, n = arr.length - 1;
            int temp = arr[n];

            for (int i = n; i - 1 >= 0; i--) {
                if (temp > maxNumber) {
                    maxNumber = temp;
                }
                temp = arr[i - 1];
                arr[i - 1] = maxNumber;
            }
            arr[n] = -1;

            return arr;
        }

    }
}
