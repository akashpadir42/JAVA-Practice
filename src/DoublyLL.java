public class DoublyLL {
    public static class Node{
        Node prev;
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static Node insertAtHead(Node head, int x){
        Node t=new Node(x);
        t.next=head;
        head.prev=t;
        head=t;
        return head;
    }

    public static Node insertAtTail(Node head, int x){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node t= new Node(x);
        temp.next=t;
        t.prev=temp;
        return head;
    }

    public static Node inserAtidx(Node head, int x, int idx){
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        Node t= new Node(x);
        temp.next.prev=t;
        t.prev=temp;
        t.next=temp.next;
        temp.next=t;
        return head;
    }

    public static Node deleteHead(Node head){
        Node temp= head.next;
        head=temp;
        head.prev=null;
        return head;
    }

    public static Node deleteTail(Node head){
        Node temp= head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    public static Node deleteAtidx(Node head, int idx){
        Node temp=head;
        for(int i=0; i<idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
        return head;
    }

    public static boolean isPalindrome(Node head){
        Node temp=head;
        Node h=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node t=temp;
        while(h!=t){
            if(h.val!=t.val) return false;
            h=h.next;
            t=t.prev;
        }
        return true;
    }

    public static void twosum(Node head, int target){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node t=temp;
        Node h=head;

        while(h.val<t.val){
            if(h.val+t.val==target){
                System.out.print(h.val+"+"+t.val+"="+target);
                break;
            } else if (h.val+t.val>target) {
                t=t.prev;
            } else{
                h=h.next;
            }
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(10);
        Node e = new Node(100);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        display(a);
//        Node newHead=insertAtHead(a,20);
//        display(newHead);
//        Node newHead1=insertAtTail(a,6);
//        display(newHead1);
//        Node midhead=inserAtidx(a,50,3);
//        display(midhead);
//        Node deletehead=deleteHead(a);
//        display(deletehead);
//        Node deleteTail=deleteTail(a);
//        display(deleteTail);
//        Node deleteatidx=deleteAtidx(a,3);
//        display(deleteatidx);
//        System.out.println(isPalindrome(a));
        twosum(a,9);
    }
}
