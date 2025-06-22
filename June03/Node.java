public class Node {
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class SLL{
    Node head;
    SLL(){
        head=null;//when no linkedlist
    }
    void insertAtHead(int val){
        Node n=new Node(val);
        n.next=head;
        head=n;

    }
    void insertAtTail(int val){
        Node n=new Node(val);
        if(head==null){
           // head=n;
            insertAtHead(val);
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
    }
    void insertAtPos(int val,int pos){
        Node n=new Node(val);
        if(pos<0 || pos>getsize()){
            System.out.println("Out of bounds");
            return;
        }
        if(pos==0){
            n.next=head;
            head=n;
            return;
        }
        Node temp=head;
        while(temp!=null && --pos>0){
            temp=temp.next;
        }
        n.next=temp.next;
        temp.next=n;
    }
    int getsize(){
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        return size;
    }
    void printlist(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    void deleteAtHead(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        Node temp=head;
        head=head.next;
        temp.next=null;

    }
    void deleteByVal(int val){
    /*    if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.data==val){
            deleteAtHead();
            return;
        }
        Node temp=head;
        Node prev=null;
        while(temp!=null && temp.data!=val){
            prev=temp;
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Value does not exist");
            return;
        }
        prev.next=temp.next;
    */

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Case 1: If head itself is the node to delete
        if (head.data == val) {
            deleteAtHead();
            return;
        }

        Node temp = head;

        // Traverse until the node before the target node is found
        while (temp.next != null && temp.next.data != val) {
            temp = temp.next;
        }

        // Case 2: If target node is not found
        if (temp.next == null) {
            System.out.println("Value does not exist");
            return;
        }

        // Case 3: Unlink the node
        Node tobedeleted=temp.next;
        temp.next = temp.next.next;
        tobedeleted.next=null;


    }
}
class DriverCode{
    public static void main(String[] args) {
        SLL sll=new SLL();
        sll.insertAtHead(90);
        sll.insertAtHead(80);
        sll.insertAtHead(70);
        sll.insertAtHead(60);

        sll.insertAtTail(10);
        sll.insertAtTail(20);
        sll.insertAtTail(30);
        sll.insertAtTail(40);

        sll.insertAtPos(500,3);
        sll.insertAtPos(1000,0);
        sll.deleteAtHead();
        sll.deleteByVal(90);
        sll.printlist();
    }
}