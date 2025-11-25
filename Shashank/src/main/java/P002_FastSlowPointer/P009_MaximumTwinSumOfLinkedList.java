package src.main.java.P002_FastSlowPointer;

// https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/
public class P009_MaximumTwinSumOfLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        public int pairSum(ListNode head) {
            ListNode slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            ListNode p2 = reverseLL(slow);
            ListNode p1 = head;
            int max = 0;

            while (p2 != null && p1 != null) {
                int sum = p1.val + p2.val;
                if (sum > max)
                    max = sum;
                p1 = p1.next;
                p2 = p2.next;
            }

            return max;
        }

        public ListNode reverseLL(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;

            while (curr != null) {
                ListNode nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }
            return prev;
        }

    }
}
