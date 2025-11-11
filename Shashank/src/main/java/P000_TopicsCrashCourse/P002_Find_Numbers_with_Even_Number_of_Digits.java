package src.main.java.P000_TopicsCrashCourse;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class P002_Find_Numbers_with_Even_Number_of_Digits {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.findNumbers(new int[]{555,901,482,1771}));
    }

    static class Solution {
        public int findNumbers(int[] nums) {
            int count = 0;
            for (int num : nums) {
                if (isEvenDigits(num))
                    count++;
            }
            return count;
        }

        private boolean isEvenDigits(int num) {
            int count = 0;
            while (num > 0) {
                count++;
                num = num / 10;
            }
            return count % 2 == 0;
        }
    }
}
