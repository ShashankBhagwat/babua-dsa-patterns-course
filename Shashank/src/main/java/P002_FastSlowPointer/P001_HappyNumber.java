package src.main.java.P002_FastSlowPointer;

// https://leetcode.com/problems/happy-number/description/
public class P001_HappyNumber {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isHappy(2));
    }

    static class Solution {
        public boolean isHappy(int n) {
            int slow = n, fast = n;

            do {
                slow = sumOfSquareOfDigits(slow);
                fast = sumOfSquareOfDigits(sumOfSquareOfDigits(fast));

            } while (fast != 1 && slow != fast);

            return fast == 1;
        }

        private int sumOfSquareOfDigits(int num) {
            int sum = 0;
            while (num > 0) {
                int rem = num % 10;
                sum += rem * rem;
                num /= 10;
            }
            return sum;
        }
    }


}
