public class Treverse_A_Circular_LinkedList_ {
    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }

    }

    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
       head.next.next.next=head;  // it show Circuler Linked List  // yaha per circular linkedList create ho gya haa
        printlist(head);

    }

    public static void printlist(Node head){
      if(head==null) return ;
        System.out.print(head.data+" ");// first element ko pahele he print karna haa
        for(Node curr=head.next;curr!=head;curr=curr.next){      // ya  for na use karke while use kar sakte ho 
                                                                    //Node curr=head.next;
                                                                    // while(curr!=head){
                                                                   // System.out.print(curr.data+" ");
                                                                    //curr=curr.next;
                                                                     //      }
            System.out.print(curr.data+" ");
            
             
        }
    }





}
