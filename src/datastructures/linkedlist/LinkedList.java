package datastructures.linkedlist;

import java.util.HashSet;

public class LinkedList {

    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }


    public Node findKthFromEnd(int k) {
        if (k <= 0) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        // Move fast pointer k-1 steps ahead
        for (int i = 1; i < k; i++) {
            if (fast == null || fast.next == null) {
                return null;
            }
            fast = fast.next;
        }

        // If list is shorter than k
        if (fast == null) {
            return null;
        }

        // Move both pointers until fast reaches the last node
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
    public void removeDuplicates() {
        HashSet<Integer> set = new HashSet<>();

        Node current = head;
        Node prev = null;

        while (current != null) {
            if (set.contains(current.value)) {
                prev.next = current.next;
            } else {
                set.add(current.value);
                prev = current;
            }
            current = current.next;
        }

        tail = prev;
    }
}


