import java.util.Scanner;

public class loopegsum {
    public static void main(String[] args) {
        int counter=0, n, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        n=sc.nextInt();

        while (counter<=n){
            System.out.print(counter + " ");
            sum=sum+counter;
            counter++;
        }
        System.out.println("\nSum= " +sum);
    }
}
