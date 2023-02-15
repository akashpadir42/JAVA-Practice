import java.util.Scanner;

public class whileloop1 {
    public static void main(String[] args) {
        int counter=1,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        n=sc.nextInt();

        while (counter<=n){
            System.out.println(counter);
            counter++;
        }
    }
}
