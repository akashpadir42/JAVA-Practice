import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        int n, i;

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number: ");
        n=sc.nextInt();

        for (i=1; i<=10; i++){
            int mul= i*n;
            System.out.println(n + "*" + i + "= " + mul);
        }
    }
}
