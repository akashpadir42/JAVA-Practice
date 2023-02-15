import java.util.Scanner;

//Average of 3 numbers
public class varhwq1 {
    public static void main(String[] args) {
        int a,b,c,avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 Numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        avg= (a+b+c)/3;
        System.out.print("Average of 3 numbers= "+avg);
    }
}
