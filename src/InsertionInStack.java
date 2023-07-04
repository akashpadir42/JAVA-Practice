import java.util.Stack;

public class InsertionInStack {
    public static void main(String[] args) {
        Stack<Integer> st1= new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        st1.push(50);
        System.out.println(st1);
        Stack <Integer> st2= new Stack<>();
        /* Insertion at any index
        int idx=3; int x=90;
        while(st1.size()>idx){
            st2.push(st1.pop());
        }
        st1.push(x);
        while(st2.size()>0){
            st1.push(st2.pop());
        }
        System.out.println(st1);
         */
        while(st1.size()>0){
            st2.push(st1.pop());
        }
        while(st2.size()>0){
            System.out.print(st2.peek() +" ");
            st1.push(st2.pop());
        }
        System.out.println(st1);
    }
}
