import java.util.Scanner;

public class nXnQueens {
    public static boolean nQueens(char board[][], int row) {
        //base case
        if (row == board.length){
            count++;
//            printBoard(board);
            return true;
        }
        //work
        for (int j=0; j< board.length; j++){
            if (isSafe(board, row, j)){
                board[row][j]='Q';
                if (nQueens(board, row+1)){
                    return true;
                }
                board[row][j]='X'; //backtracking step
            }
        }
        return false;
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int i=row-1;i>=0; i--){
            if (board[i][col]=='Q'){
                return false;
            }
        }

        //diagonal left up
        for (int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if (board[i][j]=='Q'){
                return false;
            }
        }

        //diagonal right up
        for (int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char board[][]) {
        System.out.println("--------Chess Board--------");
        for (int i=0; i< board.length; i++){
            for (int j=0; j< board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int count=0;
    public static void main(String[] args) {
//        int n=3;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= sc.nextInt();
        char board[][]= new char[n][n];

        //initalize
        for (int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0);
//        System.out.print("Total ways to solve nQueens= "+count);
        if (nQueens(board,0)){
            System.out.println("Solution to solve nQueens problem is possible..");
            printBoard(board);
        } else{
            System.out.println("Solution to solve nQueens problem is not possible..");
        }
    }
}
