import java.util.Scanner;

public class fact_fn {

    public static int factorial(int num) {
        int f=1;

        for (int i=1; i<=num; i++){
            f*=i;
        }
        return f;
    }
    public static void main(String[] args) {

        System.out.print(factorial(3));

    }
}
