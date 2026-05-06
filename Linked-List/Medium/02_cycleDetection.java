class solution{
     static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
     boolean isCycle(Node head){
               if(head ==null || head.next == null)return false;
               Node slow = head;
               Node fast = head.next;

               while(fast!=slow){
                      slow = slow.next;
                      fast = fast.next.next;  
               }
     
        return false;
    }
}
