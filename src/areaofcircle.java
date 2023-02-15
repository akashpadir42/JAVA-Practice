import java.sql.SQLOutput;
import java.util.*;
public class areaofcircle {
    public static void main(String[] args) {

        float pi=3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of Circle: ");
        float R = sc.nextFloat();
        double area= pi*R*R;
        System.out.println("Area Of Circle= "+area);


    }
}
