import java.util.Scanner;

public class evenodd {
    public static boolean isEven(int n){
        if (n%2==0)
            return true;
        else
            return  false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n= sc.nextInt();

        System.out.println(isEven(n));
        if (isEven(n)){
            System.out.println(n+ " is Even Number..");
        }
        else {
            System.out.println(n+ " is Odd Number..");
        }
    }
}
