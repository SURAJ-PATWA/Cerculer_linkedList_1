public class Delete_HeadCircularLinkedList_EfficientSolution {
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
        head=delHead(head);    //  20 30
        printlist(head);

    }

    public  static Node delHead(Node head) {
        if(head==null||head.next==null){
            return null;
        }
        head.data=head.next.data;
        head.next=head.next.next;
        return head;
    }










}
