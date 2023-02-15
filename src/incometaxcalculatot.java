import java.util.Scanner;

public class incometaxcalculatot {
    public static void main(String[] args) {
        int income, taxamt, totalamt;

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the income: ");
        income=sc.nextInt();

        if (income<=500000){
            taxamt=0;
        } else if (income>500000 && income<=1000000) {
            taxamt= (int) (income* (0.2));
        }
        else{
            taxamt= (int) (income* (0.3));
        }
        totalamt= income + taxamt;
        System.out.print("Your Tax is: " +taxamt);
        System.out.println("");
        System.out.print("Total amount(with tax*) is: " + totalamt);
    }
}
