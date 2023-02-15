import java.util.Scanner;

public class setofintegers {
    public static void main(String[] args) {
        int num;
        int evensum=0;
        int oddsum=0;
        int choice;

        do {
            System.out.print("Enter the number: ");
            Scanner sc= new Scanner(System.in);
            num= sc.nextInt();

            if (num%2==0){
                evensum+=num;
            }
            else{
                oddsum+=num;
            }
            System.out.print("To continue press 1 : ");
            choice=sc.nextInt();
        }while(choice==1);
        System.out.print("Sum of Even Numbers is= "+evensum);
        System.out.println();
        System.out.print("Sum of Odd Numbers is= "+oddsum);
    }
}
