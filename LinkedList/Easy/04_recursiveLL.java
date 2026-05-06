class Solution {
    int length(Node head) {
        if (head == null) {
            return 0;
        }

        return 1 + length(head.next);
    }

    Node insertAtLast(Node head, int data) {

        // When recursion reaches null
        if (head == null) {
            return new Node(data);
        }

        // Move forward recursively
        head.next = insertAtLast(head.next, data);

        return head;
    }
}