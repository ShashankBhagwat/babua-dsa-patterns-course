package src.main.java.P002_FastSlowPointer;

import java.util.HashSet;

public class P010_CircularArrayLoop {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.circularArrayLoopBrute(new int[]{1, -1, 5, 1, 4}));
    }

    static class Solution {
        public boolean circularArrayLoop(int[] nums) {
            int n = nums.length;

            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) continue;   // already processed → skip

                boolean forward = nums[i] > 0;
                int slow = i, fast = i;

                while (true) {
                    slow = next(nums, slow, forward);
                    if (slow == -1) break;

                    fast = next(nums, fast, forward);
                    if (fast == -1) break;

                    fast = next(nums, fast, forward);
                    if (fast == -1) break;

                    if (slow == fast) return true;
                }

                // mark entire path as visited (set value = 0)
                slow = i;
                int val = nums[i];

                while ((nums[slow] > 0) == (val > 0)) {
                    int nextIdx = ((slow + nums[slow]) % n + n) % n;
                    nums[slow] = 0;  // mark visited & dead
                    slow = nextIdx;
                    if (nums[slow] == 0) break;
                }
            }

            return false;
        }

        private int next(int[] nums, int curr, boolean forward) {
            boolean dir = nums[curr] > 0;
            if (dir != forward) return -1;

            int n = nums.length;
            int next = ((curr + nums[curr]) % n + n) % n;

            if (next == curr) return -1;  // one-element loop

            return next;
        }

        public boolean circularArrayLoopBrute(int[] nums) {

            int n = nums.length;

            for (int start = 0; start < n; start++) {

                boolean forward = nums[start] > 0;    // intended direction
                HashSet<Integer> visited = new HashSet<>();

                int curr = start;

                while (true) {

                    // direction mismatch → break
                    if ((nums[curr] > 0) != forward)
                        break;

                    // compute next index
                    int next = ((curr + nums[curr]) % n + n) % n; // correct modulo

                    // single-element loop → invalid
                    if (next == curr)
                        break;

                    // cycle detected
                    if (visited.contains(next))
                        return true;

                    visited.add(curr);
                    curr = next;
                }
            }

            return false;
        }
    }
}
