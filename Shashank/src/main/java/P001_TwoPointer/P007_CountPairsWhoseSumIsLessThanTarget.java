package src.main.java.P001_TwoPointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/
public class P007_CountPairsWhoseSumIsLessThanTarget {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.countPairs(List.of(-1,1,1,2,3), 2));
    }

    static class Solution {
        public int countPairs(List<Integer> nums, int target) {
            int count = 0;
            // -1,1,1,2,3

            List<Integer> list = new ArrayList<>(nums);
            Collections.sort(list);

            int i = 0, j = list.size() - 1;
            while (i < j) {
                if (list.get(i) + list.get(j) < target) {
                    count = count + j - i;
                    i++;
                } else {
                    j--;
                }
            }
            return count;
        }
    }
}
