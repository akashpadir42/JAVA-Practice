import java.util.Scanner;

public class avg_of_3nos {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers:");
        double n1= sc.nextDouble();
        double n2= sc.nextDouble();
        double n3= sc.nextDouble();

        System.out.println(average(n1,n2,n3));
    }
    public static double average(double n1,double n2,double n3){
        double avg= (n1+n2+n3)/3;
        return avg;
    }
}
