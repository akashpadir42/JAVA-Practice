import java.util.Scanner;

public class LargestIn2D {

    public static void findLargest(int matrix[][]) {
        int largest= Integer.MIN_VALUE;

        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if (largest<matrix[i][j]){
                   largest= matrix[i][j];
                }
            }
        }
        System.out.println("Largest Element in Matrix is: "+ largest);
    }
    public static void main(String[] args) {
        int matrix[][]= new int[3][3];
        Scanner sc= new Scanner(System.in);
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        findLargest(matrix);
    }
}
