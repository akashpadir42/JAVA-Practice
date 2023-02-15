import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n, fact=1;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        n= sc.nextInt();

        for (int i=n; i>=1; i--){
            fact= fact*i;
        }
        System.out.print("Factorial= " +fact);
    }
}
