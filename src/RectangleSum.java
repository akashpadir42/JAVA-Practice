import java.util.Scanner;

public class RectangleSum {
    static void prefix(int [][] matrix){
        int r= matrix.length;
        int c= matrix[0].length;
        for (int i=0; i<r; i++){
            for (int j=1; j<c; j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }
        for (int j=0; j<c; j++){
            for (int i=1; i<r; i++){
                matrix[i][j]+=matrix[i-1][j];
            }
        }
    }
    static int rectangleSum2(int [][] matrix, int l1, int r1, int l2, int r2){
        int sum=0;
        prefix(matrix);
        for (int i=l1; i<=l2; i++){
            if (r1>0){
                sum+=matrix[i][r2]-matrix[i][r1-1];
            } else{
                sum+=matrix[i][r2];
            }
        }
        return sum;
    }
    static int rectangleSum(int [][] matrix, int l1, int r1, int l2, int r2){
        int sum=0;
        for (int i=l1; i<=l2; i++){
            for (int j=r1; j<=r2;j++){
                sum+=matrix[i][j];
            }
        }
        return sum;
    }

    static int rectangleSum3(int [][] matrix, int l1, int r1, int l2, int r2){
        prefix(matrix);
        int sum=0, up=0, left=0, leftUp=0, ans=0;
        sum=matrix[l2][r2];
        if (l1>=1)
            up= matrix[l1-1][r2];
        if (r1>=1)
            left= matrix[l1][r1-1];
        if (l1>=1 && r1>=1)
            leftUp= matrix[l1-1][r1-1];

        ans= sum-up-left+leftUp;

        return ans;
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
        printMatrix(matrix);
        System.out.print("Enter rectangle boundaries(l1, r1, l2, l2): ");
        int l1= sc.nextInt();
        int r1= sc.nextInt();
        int l2= sc.nextInt();
        int r2= sc.nextInt();

        System.out.println(rectangleSum(matrix, l1, r1, l2, r2));
//        System.out.println(rectangleSum2(matrix, l1, r1, l2, r2));
        System.out.println(rectangleSum3(matrix, l1, r1, l2, r2));
    }
}
