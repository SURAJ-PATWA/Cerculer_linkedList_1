public class Delete_HeadCircularLinkedList_NaiveSolution {
    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }

    }


    public static void printlist(Node head){
        if(head==null)return;
        System.out.print(head.data+" ");
        Node curr=head.next;
        while(curr!=head){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=head;
        printlist(head);      // 10 20 30
        head=delHead(head,40);    // 10 20 30 40
        printlist(head);

    }

    public  static Node delHead(Node head, int x) {
        if(head==null||head.next==null){
            return null;
        }
        Node curr=head;
        while(curr.next!=head){
            curr=curr.next;
        }
        curr.next=head.next;
        head=curr.next;
        return head;


    }
}
