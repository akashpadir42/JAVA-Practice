//write a program that outputs the number which when added to the
// sum of its digits should match the input.
// eg : input:21 output : 15 (15+1+5=21)

import java.util.Scanner;

public class sumofnumber {
    static int add(int n){
        for (int i=10; i<=n; i++){
            int num=0;
            while(i>0){
                num=i/10;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        System.out.println(add(n));
    }
}
