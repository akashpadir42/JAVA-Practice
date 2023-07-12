import java.util.Scanner;

public class PascalTriangle {
    static int[][] pascal(int n){
        int [][] ans= new int[n][];
        for (int i=0; i<n; i++){
            //ith row has i+1 col's
            ans[i]= new int[i+1];
            // first and last index is 1
            ans[i][0]=ans[i][i]=1;

            for (int j=1; j<i; j++){
                ans[i][j]= ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return  ans;
    }
    static void printMatrix(int [][] matrix, int n) {
        for (int i = 0; i < matrix.length; i++) {
            if (i == n) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter N: ");
        int n= sc.nextInt();
        int [][] ans= pascal(n);
        System.out.println("Pascal Triangle");
        printMatrix(ans,n);
    }
}
