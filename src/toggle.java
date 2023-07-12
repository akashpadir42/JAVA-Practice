import java.util.*;
public class toggle {
    static void toggle(StringBuilder sb){
        for (int i=0; i<sb.length(); i++){
            char ch= sb.charAt(i);
            boolean flag= true; //capital
            int ascii= (int) ch;
            if (ascii<65 || ch==' ') continue;
            if (ascii>=97) flag=false; //small
            if (flag==true){
                ascii+=32;
                char c= (char) ascii;
                sb.setCharAt(i,c);
            } else {
                ascii-=32;
                char c= (char) ascii;
                sb.setCharAt(i,c);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter String: ");
        StringBuilder sb= new StringBuilder(sc.nextLine());
        System.out.println(sb);
        toggle(sb);
        System.out.println(sb);

    }
}
