public class DiagonalSum {

    public static int diagonalSum(int matrix[][]){
        int sum=0;
        //primary diagonal
        for (int i=0; i<=matrix.length-1; i++){
            sum+=matrix[i][i];

        //secondary diagonal
        if (i != matrix.length-1-i)
            sum+=matrix[i][matrix.length-i-1];
        }
       return sum;
    }
    public static void main(String[] args) {
        int matrix[][]= {{1,2,3},
                {5,6,7},
                {9,10,11}};
        System.out.print("Sum Of Diagonal Element: " + diagonalSum(matrix));
    }
}
