package src.main.java.P002_FastSlowPointer;

// https://www.geeksforgeeks.org/dsa/find-length-of-loop-in-linked-list/
public class P005_LengthOfCycleLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    static class Solution {

        static int lengthOfLoop(Node head) {
            Node meetingPoint = findMeetingPoint(head);

            if (meetingPoint == null)
                return 0;

            return calculateCycleLength(meetingPoint);
        }

        private static Node findMeetingPoint(Node head) {
            Node slow = head, fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;          // move one step
                fast = fast.next.next;     // move two steps

                if (slow == fast)          // cycle detected
                    return slow;
            }
            return null; // no cycle
        }

        private static int calculateCycleLength(Node meetingPoint) {
            Node curr = meetingPoint.next;
            int length = 1;

            while (curr != meetingPoint) { // loop until it returns to same node
                curr = curr.next;
                length++;
            }
            return length;
        }
    }
}

