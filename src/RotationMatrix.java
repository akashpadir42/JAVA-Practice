import java.util.Scanner;

public class RotationMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter N(Matrix size NxN)");
        int N= sc.nextInt();
        int [][] matrix= new int[N][N];
        System.out.println("Enter the "+ N*N+ " elements of Matrix:");
        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix");
        printMatrix(matrix);

        rotate(matrix,N);
        System.out.println("Rotated Array");
        printMatrix(matrix);
    }
    static void rotate(int[][] matrix, int N){
        //make transpose
        TransposeInPlace(matrix,N,N);
        //make transpose reverse
        for (int i=0; i<N;i++){
            reverseArray(matrix[i]);
        }
    }
    static void TransposeInPlace(int [][] matrix, int row, int col){
        for (int i=0; i<col; i++){
            for (int j=i; j<row;j++){
                int temp= matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static void reverseArray(int [] arr){
        int i=0, j= arr.length-1;
        while(i<j){
//            int temp= arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
            arr[i]= arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            i++;
            j--;
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
}
