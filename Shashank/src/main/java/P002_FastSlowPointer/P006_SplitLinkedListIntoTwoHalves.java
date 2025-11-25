package src.main.java.P002_FastSlowPointer;

// https://leetcode.com/problems/split-a-circular-linked-list/description/
public class P006_SplitLinkedListIntoTwoHalves {

    static class Pair<U, V> {
        public U first;
        public V second;

        public Pair(U first, V second) {
            this.first = first;
            this.second = second;
        }
    }


    // Node of a linked list
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // 10 9 4 10 9
    //      s
    //           f
    static class Solution {
        public Pair<Node, Node> splitList(Node head) {
            Node slow = head, fast = head.next;

            while (fast != head && fast.next != head) {
                slow = slow.next;
                fast = fast.next;

                if(fast.next != head)
                    fast = fast.next;
            }

            fast.next = slow.next;
            slow.next = head;

            return new Pair<>(head, fast.next);
        }
    }
}
