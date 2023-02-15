import java.util.Scanner;

public class ArrFunctionArguments {

    public static void arr(int marks[], int nonChangable){
        nonChangable=10;
        for (int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }

    public static void main(String[] args) {
        int nonChangable=5;
        int marks[]= new int[5];
        Scanner sc= new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[3]=sc.nextInt();
        marks[4]=sc.nextInt();
        arr(marks,nonChangable);
        System.out.println(nonChangable);

        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }
}
