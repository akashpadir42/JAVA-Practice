import java.util.Scanner;

public class costproblem {
    public static void main(String[] args) {
        float pencilcost, pencost, erasercost, totalcost;
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter cost of Pencil: ");
        pencilcost=sc.nextFloat();
        System.out.print("Enter cost of Pen: ");
        pencost=sc.nextFloat();
        System.out.print("Enter cost of Erase: ");
        erasercost=sc.nextFloat();

        totalcost= (pencilcost+pencost+erasercost);
        float gst= (18*totalcost)/100;
        float totalcostwithgst= (totalcost + gst);
        System.out.print("Total Cost with 18% GST=Rs. "+ totalcostwithgst);


    }

}
