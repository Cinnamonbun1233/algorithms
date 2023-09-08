package codingbat;

/**
 * Задача codingbat.GreaterNode
 * https://www.geeksforgeeks.org/delete-nodes-list-greater-x/
 */

public class GreaterNode {
    public static Node deleteGreater(Node head, int x) {
        Node fNode = new Node(0);
        Node prev = fNode;
        while (head != null) {
            if (head.data > x) {
                prev.next = head.next;
            } else {
                prev.next = head;
                prev = head;
            }
            head = head.next;
        }
        return fNode.next;
    }
}

class Node {
    public int data;
    public Node next = null;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }
}