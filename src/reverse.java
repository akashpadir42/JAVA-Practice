import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n= sc.nextInt();
        System.out.println(reverse_number(n));

        if (reverse_number(n)){
            System.out.println(n+ " is Palindrome Number..");
        }
        else {
            System.out.println(n+ " is Not Palindrome Number..");
        }

    }

    public static boolean reverse_number(int n){
        int rev=0;
        int num=n;
        while (n>0){
            int remainder= n%10;
            rev= rev*10 + remainder;
            n/=10;
        }
        if (num==rev){
            return true;
        }
        return false;

    }
}
