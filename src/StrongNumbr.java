import java.util.Scanner;

public class StrongNumbr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isStrongNumber(num)) {
            System.out.println(num + " is a strong number.");
        } else {
            System.out.println(num + " is not a strong number.");
        }
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    private static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            sum += factorial(lastDigit);
            num /= 10;
        }
        return (sum == originalNum);
    }
}
