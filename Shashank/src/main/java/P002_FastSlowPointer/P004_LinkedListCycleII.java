package src.main.java.P002_FastSlowPointer;

// https://leetcode.com/problems/linked-list-cycle-ii/description/
public class P004_LinkedListCycleII {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    static class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast)
                    break;
            }

            if (fast == null || fast.next == null)
                return null;

            ListNode n1 = slow, n2 = head;
            while (n1 != n2) {
                n1 = n1.next;
                n2 = n2.next;
            }

            return n1;
        }
    }
}
