import java.util.Scanner;

public class multipleof10egloop {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        do {
            System.out.print("Enter the Number:");
            n=sc.nextInt();
            if (n%10==0){
                continue;
            }
            System.out.println(n);
        }while (true);
    }
}
