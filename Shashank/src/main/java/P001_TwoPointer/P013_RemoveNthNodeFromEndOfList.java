package src.main.java.P001_TwoPointer;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
public class P013_RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {

        // Create Linked List: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        Solution s = new Solution();

        int n = 2; // remove 2nd node from end (removes '4')

        ListNode newHead = s.removeNthFromEnd1(head, n);

        System.out.println("\nList After Removing " + n + "th Node From End:");
        printList(newHead);
    }

    // Utility function to print the list
    static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Your solution code
    static class Solution {
        public ListNode removeNthFromEnd2(ListNode head, int n) {

            int size = 0;
            ListNode temp = head;
            while (temp != null) {
                temp = temp.next;
                size++;
            }

            if (size == n)
                return head;

            ListNode curr = head;
            for (int i = 0; i < size - n - 1; i++) {
                curr = curr.next;
            }

            curr.next = curr.next.next;
            return head;
        }

        public ListNode removeNthFromEnd1(ListNode head, int n) {

            ListNode dummy = new ListNode(0);
            dummy.next = head;

            ListNode person1 = dummy;
            ListNode person2 = dummy;

            int i = 0;
            while (person2.next != null) {
                if (i >= n) {
                    person1 = person1.next;
                }
                person2 = person2.next;
                i++;
            }
            assert person1.next != null;
            person1.next = person1.next.next;
            return dummy.next;
        }
    }
}

// ListNode class
class ListNode {
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
