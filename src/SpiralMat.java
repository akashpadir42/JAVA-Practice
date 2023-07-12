import java.util.Scanner;

public class SpiralMat {
    static void generateSpiralMatrix(int matrix[][], int r, int c) {
        int topRow = 0, bottomRow = r - 1, rightCol = c - 1, leftCol = 0, totalElements = 0, curr = 1;

        while (totalElements < r * c) {
            //topRow
            for (int j = leftCol; j <= rightCol && totalElements < r * c; j++) {
                matrix[topRow][j] = curr;
                curr++;
                totalElements++;
            }
            topRow++;

            //RightCol
            for (int i = topRow; i <= bottomRow && totalElements < r * c; i++) {
                matrix[i][rightCol] = curr;
                curr++;
                totalElements++;
            }
            rightCol--;

            //bottomRow
            for (int j = rightCol; j >= leftCol && totalElements < r * c; j--) {
                matrix[bottomRow][j] = curr;
                curr++;
                totalElements++;
            }
            bottomRow--;

            //leftcol
            for (int i = bottomRow; i >= topRow && totalElements < r * c; i--) {
                matrix[i][leftCol] = curr;
                curr++;
                totalElements++;
            }
            leftCol++;
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
        System.out.println("Enter n");
        int n= sc.nextInt();
        int [][] matrix= new int[n][n];
        generateSpiralMatrix(matrix, n, n);
        System.out.println("Spiral Matrix");
        printMatrix(matrix);

    }

}

