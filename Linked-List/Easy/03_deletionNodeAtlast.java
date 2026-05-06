 class deletionNodeAtlast {
    void lastNodeDelete(Node head){
         if(head == null){
            return;
         }
         if(head.next ==null){
            head=null;
         }

         Node temp = head;

         while(temp.next.next != null){
            temp = temp.next;
         }

         temp.next =null;
    

    }
    
}
