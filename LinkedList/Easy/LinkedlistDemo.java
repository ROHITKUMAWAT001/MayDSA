class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedlistDemo {
    Node head;

    void insert(int data) {

        Node newNode = new Node(data);
        if(head == null){
            head =newNode;
            return;
        }

        Node temp = head ;
        while(temp.next !=null){
            temp =temp.next;

        }
        temp.next =newNode;

    }

    //traversal

    void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data +"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedlistDemo list = new LinkedlistDemo();

        list.insert(18);
        list.insert(808);
        list.insert(0);
        list.insert(1);
        list.insert(8);

        list.display();
    }
}