package geeks_for_geeks;

/**
 * Задача на Linked List
 * https://www.geeksforgeeks.org/segregate-even-and-odd-elements-in-a-linked-list/
 */

public class EvenOddNotes {
    public static Node divide(int N, Node head) {
        Node fNodeOdd = new Node(0);
        Node fNodeEven = new Node(0);
        Node odd = fNodeOdd;
        Node even = fNodeEven;

        while (head != null) {
            if (head.data % 2 != 0) {
                odd.next = head;
                odd = odd.next;
            } else {
                even.next = head;
                even = even.next;
            }
            head = head.next;
        }

        odd.next = null;
        even.next = fNodeOdd.next;
        return fNodeEven.next;
    }

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }
}