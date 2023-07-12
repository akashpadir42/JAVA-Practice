import java.util.Scanner;

public class TransposeMatrix {
    //Approach 1: using extra matrix
    static int [][] makeTranspose(int [][] matrix, int row, int col){
        int [][] transposeMatrix= new int[col][row];
        for (int i=0; i< col;i++){
            for (int j=0; j< row;j++){
                transposeMatrix[i][j]= matrix[j][i];
            }
        }
        return transposeMatrix;
    }

    //Aproach 2: InPlace
    static void TransposeInPlace(int [][] matrix, int row, int col){
        for (int i=0; i<col; i++){
            for (int j=i; j<row;j++){
                int temp= matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static void printMatrix(int [][] matrix){
        for (int i=0; i< matrix.length;i++){
            for (int j=0; j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
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
        TransposeInPlace(matrix,row,col);
        System.out.println("Transpose Matrix");
        printMatrix(matrix);
    }
}
