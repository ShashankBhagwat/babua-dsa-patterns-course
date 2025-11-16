package src.main.java.P000_TopicsCrashCourse;

// https://leetcode.com/problems/design-linked-list/
public class P004_DesignLinkedList {

    public static void main(String[] args) {
        MyLinkedList list1 = new MyLinkedList();
        list1.addAtTail(1);
        list1.addAtTail(2);
        list1.addAtTail(3);

        System.out.println(list1.get(0)); // 1
        System.out.println(list1.get(1)); // 2
        System.out.println(list1.get(2)); // 3
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class MyLinkedList {

    Node head;
    int size;

    public MyLinkedList() {
        head = new Node(0);
        size = 0;
    }

    public int get(int index) {

        if (index < 0 || index >= size) return -1;

        Node curr = head.next;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.data;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;

        Node curr = head;


        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        Node newNode = new Node(val);
        newNode.next = curr.next;
        curr.next = newNode;

        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;
        size--;
    }
}
