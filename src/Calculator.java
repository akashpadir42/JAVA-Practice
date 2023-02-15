import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 2 numbers: ");
        num1= sc.nextInt();
        num2= sc.nextInt();

        System.out.print("Which Operation you want to perform(+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Please check input..");
        }
    }
}
