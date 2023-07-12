import java.util.Scanner;

public class Matrix {

    static void printMatrix(int[][] matrix){
        for (int i=0; i< matrix.length;i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void sum(int mat1[][], int r1, int c1, int mat2[][], int r2, int c2){
        if (r1!=r2 || c1!=c2){
            System.out.println("Wrong Input--Addition Not Possible(Check matrix dimensions)..");
            return;
        }
        System.out.println("Sum of Matrix 1 & Matrix 2");
        int [][] sum= new int[r1][c1];
        for (int i=0; i<r1; i++){
            for (int j=0; j<c1; j++){
                sum[i][j]= mat1[i][j]+ mat2[i][j];
            }
        }
        printMatrix(sum);
    }


    static void multiply(int a[][], int r1, int c1, int b[][], int r2, int c2){
        if (c1!=r2){
            System.out.println("Wrong input--Check dimensions..");
            return ;
        }
        int [][] mul= new int[r1][c2];

        for (int i=0; i<r1; i++){
            for (int j=0; j<c2; j++){
                for (int k=0; k<c1; k++){
                    mul[i][j]+= a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Multiplication of Matrices");
        printMatrix(mul);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter rows and columns of Matrix 1: ");
        int r1= sc.nextInt();
        int c1= sc.nextInt();
        int [][] matrix1= new int[r1][c1];
        System.out.println("Enter "+r1*c1+" elements of Matrix 1: ");
        for (int i=0; i<r1; i++){
            for (int j=0; j<c1; j++){
                matrix1[i][j]= sc.nextInt();
            }
        }
        System.out.print("Enter rows and columns of Matrix 2: ");
        int r2= sc.nextInt();
        int c2= sc.nextInt();
        int [][] matrix2= new int[r2][c2];
        System.out.println("Enter "+r2*c2+" elements of Matrix 2: ");
        for (int i=0; i<r2; i++){
            for (int j=0; j<c2; j++){
                matrix2[i][j]= sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        printMatrix(matrix1);
        System.out.println("Matrix 2");
        printMatrix(matrix2);
//        sum(matrix1,r1,c1,matrix2,r2,c2);
        multiply(matrix1,r1,c1,matrix2,r2,c2);
    }
}
