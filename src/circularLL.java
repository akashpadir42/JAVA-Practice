public class circularLL {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static void deleteHead(Node head){
        Node temp=head;
        head=temp.next;
        Node trav=head;
        while(trav!=temp){
            trav=trav.next;
        }
        trav.next=head;
        Node print=head;
        while(print!=trav){
            System.out.print(print.val+" ");
            print=print.next;
        }
        System.out.println();
    }
    public static void display1(Node head,int idx){
       Node temp=head;
       for(int i=0; i<idx;i++){
           temp=temp.next;
       }
       Node temp2=temp.next;
       System.out.print(temp.val+" ");
       while(temp2!=temp){
           System.out.print(temp2.val+" ");
           temp2=temp2.next;
       }
        System.out.println();
    }
    public static void display(Node head){
        Node temp=head.next;
        System.out.print(head.val+" ");
        while(temp!=head){
            System.out.print(temp.val+ " ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a= new Node(1);
        Node b= new Node(5);
        Node c= new Node(4);
        Node d= new Node(3);
        Node e= new Node(7);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=a;
        display(a);
//        display1(a,2);
        deleteHead(a);
    }
}
