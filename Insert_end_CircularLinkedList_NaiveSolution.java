public class Insert_end_CircularLinkedList_NaiveSolution {
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
        head=InsertEnd(head,40);    // 10 20 30 40
        printlist(head);

    }

  public static Node InsertEnd(Node head, int x) {
      Node temp = new Node(x);
      if (head == null) {
          temp.next = temp;
          head=temp;
          return head;

      } else {
          Node curr = head;
          while (curr.next != head) {
              curr = curr.next;
          }
          curr.next = temp;
          temp.next = head;
          return head;
      }
  }

}
