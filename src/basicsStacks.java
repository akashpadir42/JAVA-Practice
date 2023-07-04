import java.util.Stack;

public class basicsStacks {
    public static void displayRev(Stack <Integer> st1){
        //base case
        if(st1.size()==0) return;
        int top=st1.pop();
        System.out.print(top+", ");
        displayRev(st1);
        st1.push(top);
    }

    public static void displayRec(Stack <Integer> st1){
        //base case
        if(st1.size()==0) return;

        int top=st1.pop();
        displayRec(st1);
        System.out.print(top+", ");
        st1.push(top);
    }

    public static void pushAtBottom(Stack <Integer> st1, int val){
        if(st1.size()==0){
            st1.push(val);
            System.out.print(val+" ");
            return;
        }
        int top= st1.pop();
        pushAtBottom(st1,val);
        System.out.print(top+" ");
        st1.push(top);
    }
    public static Stack<Integer> removeFromBottom(Stack <Integer> st1){
        Stack <Integer> st2= new Stack<>();
        while(st1.size()>1){
            st2.push(st1.pop());
        }
        st1.pop();

        while(st2.size()>0){
            st1.push(st2.pop());
        }
        return st1;
    }
    public static void main(String[] args) {
        Stack <Integer> st1= new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        st1.push(50);
//        System.out.println(st1);
//        displayRev(st1);
//        displayRec(st1);
//        pushAtBottom(st1,0);
        System.out.print(removeFromBottom(st1));
        /*
        Stack <Integer> st2= new Stack<>();
        while(st1.size()>0){
            st2.push(st1.pop());
        }
        System.out.println(st2);
        Stack <Integer> st3= new Stack<>();
        while(st2.size()>0){
            st3.push(st2.pop());
        }
        System.out.println(st3);
        */

    }
}
