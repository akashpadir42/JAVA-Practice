import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        n= sc.nextInt();

        System.out.print("Reverse Number: ");
        while(n>0){
            int lastdigit= n % 10;
            System.out.print(lastdigit);
            n/=10;
        }
        System.out.println();
    }
}
