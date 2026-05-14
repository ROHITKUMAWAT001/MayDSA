class DeletionNodeAtLast {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node lastNodeDelete(Node head) {
         if (head == null) {
                return null;
         }
         if (head.next == null) {
            return null;
         }

         Node temp = head;

         while (temp.next.next != null) {
            temp = temp.next;
         }

         temp.next = null;
         return head;
    }
}
