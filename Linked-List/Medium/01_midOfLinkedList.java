
class MidOfLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node findMiddle(Node head) {

        Node slow = head;
        Node fast = head.next;
       while( fast.next != null && fast.next.next !=null){
        fast = fast.next.next;
        slow = slow.next;
       }
       return slow;

    }

}
