package src.main.java.P002_FastSlowPointer;

// https://leetcode.com/problems/middle-of-the-linked-list/description/
public class P002_MiddleOfTheLinkedList {

    /**
     * Definition for singly-linked list.
     */
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
        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null) {
                if (fast.next == null)
                    return slow;

                if (fast.next.next == null)
                    return slow.next;

                slow = slow.next;
                fast = fast.next.next;
            }

            return null;
        }
    }
}
