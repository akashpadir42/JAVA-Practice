import java.util.Scanner;

public class Spiral_Mat_AntiCl {
    static void generateSpiralMat(int matrix[][], int r, int c){
        int topRow=0, bottomRow= r-1, leftcol=0, rightcol=c-1, totalElements=0;
        while(totalElements< r*c){
            //leftCol
            for (int i=topRow; i<=bottomRow && totalElements<r*c; i++){
                System.out.print(matrix[i][leftcol]+" ");
                totalElements++;
            } leftcol++;

            //bottomRow
            for (int j=leftcol; j<=rightcol && totalElements<r*c; j++){
                System.out.print(matrix[bottomRow][j]+" ");
                totalElements++;
            } bottomRow--;

            //rightCol
            for (int i=bottomRow; i>=topRow && totalElements<r*c; i--){
                System.out.print(matrix[i][rightcol]+" ");
                totalElements++;
            } rightcol--;

            //topRow
            for (int j=rightcol; j>=leftcol && totalElements<r*c; j--){
                System.out.print(matrix[topRow][j]+" ");
                totalElements++;
            } topRow++;
        }
    }
    static void printMatrix ( int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the rows and columns of Matrix");
        int row= sc.nextInt();
        int col= sc.nextInt();
        int [][] matrix= new int[row][col];
        System.out.println("Enter the "+ row*col+ " elements of Matrix:");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix");
        printMatrix(matrix);
        System.out.println("Spiral Order");
        generateSpiralMat(matrix, row, col);
    }
}
