import java.util.Scanner;

public class PrintSpiral {
    static void printSpiral(int matrix[][], int r, int c){
        int topRow=0, bottomRow=r-1, rightCol=c-1, leftCol=0, totalElements=0;

        while(totalElements< r*c){
            //topRow
            for(int j=leftCol; j<= rightCol && totalElements< r*c; j++){
                System.out.print(matrix[topRow][j]+" ");
                totalElements++;
            } topRow++;

            //RightCol
            for (int i=topRow; i<= bottomRow && totalElements< r*c; i++){
                System.out.print(matrix[i][rightCol]+" ");
                totalElements++;
            } rightCol--;

            //bottomRow
            for (int j=rightCol; j>=leftCol && totalElements< r*c; j--){
                System.out.print(matrix[bottomRow][j]+" ");
                totalElements++;
            } bottomRow--;

            //leftcol
            for (int i=bottomRow; i>=topRow && totalElements< r*c; i--){
                System.out.print(matrix[i][leftCol]+" ");
                totalElements++;
            } leftCol++;
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
        System.out.println("Spiral Order");
        printSpiral(matrix,row,col);
    }
}
