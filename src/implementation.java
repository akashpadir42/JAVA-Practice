public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class linkedlist{
        Node head= null;
        Node tail=null;

        void insertAtEnd(int val){
            Node temp= new Node(val);
            if (head==null){
                head=temp;
            }else{
                tail.next=temp;
            }
            tail=temp;
        }
         Node middle(Node head){
            Node slow= head;
            Node fast= head;

            while(fast.next!=null && fast.next.next!=null){
                slow= slow.next;
                fast= fast.next;
            }
            return slow;
         }

        void insertAtHead(int val){
            Node temp= new Node(val);
            if (head==null){
                head=tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }
        }

        void display(){
            Node temp= head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        int size(){
            int count=0;
            Node temp=head;
            while(temp!=null){
                count++;
                temp= temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist ll= new linkedlist();
    }
}
