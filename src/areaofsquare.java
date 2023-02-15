import java.util.Scanner;
//Area Of Square
public class areaofsquare {
    public static void main(String[] args) {
        int side;
        float area;

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter side of square: ");
        side=sc.nextInt();
        area= side*side;
        System.out.println("Area of Square= " +area);

    }
}
