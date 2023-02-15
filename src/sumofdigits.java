import java.util.Scanner;

public class sumofdigits {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n= sc.nextInt();
        System.out.println("Sum of Digits= "+ sum(n));

    }

    public static int sum(int n){
        int sum=0;
        while (n!=0){
            int lastDigit= n%10;
            sum= sum+lastDigit;
            n/=10;
        }
        return sum;
    }
}
