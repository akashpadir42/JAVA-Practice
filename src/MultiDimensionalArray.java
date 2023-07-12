import java.util.Scanner;

public class MultiDimensionalArray {

    static void printArr(int [][] arr){
        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row, col;
        System.out.print("Enter Number of Rows: ");
        row= sc.nextInt();
        System.out.print("Enter Number of Columns: ");
        col= sc.nextInt();
        int [][] arr= new int[row][col];
        System.out.println("Enter "+ row*col +" elements: ");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("2D Array");
        printArr(arr);
    }
}
