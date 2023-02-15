import java.util.Scanner;

public class product_fn {

    public static int cal_product(int A, int B){
        int prod= A*B;
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System. in);
        System.out.println("Enter the values of A & B: ");
        int A= sc.nextInt();
        int B= sc.nextInt();
        int prod= cal_product(A,B);
        System.out.print("Product= "+ prod);
    }
}
