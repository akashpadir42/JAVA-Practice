import java.util.Scanner;
public class create2Darr {
    public static boolean findelement(int matrix[][], int key) {
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j< matrix[0].length; j++){
                if (key==matrix[i][j]){
                    System.out.println("Key "+ key + " found at cell ("+ i + ","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key "+ key+ " Not Found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]= new int[3][3];
        int n= matrix.length; //No. of rows
        int m= matrix[0].length; //No. of columns

        Scanner sc= new Scanner(System.in);
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        findelement(matrix,5);
    }
}
