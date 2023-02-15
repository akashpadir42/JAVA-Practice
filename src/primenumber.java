import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        n= sc.nextInt();

        if (n==2){
            System.out.println(n + " is prime number.");
        }
        else {
            boolean prime= true;
            for (i=2;i<= Math.sqrt(n);i++){
                if (n%i==0) {
                    prime = false;
                }
            }
            if (prime==true)
                System.out.println(n+ " is prime number.");
            else
                System.out.println(n+ " is not prime number.");
        }
    }
}
