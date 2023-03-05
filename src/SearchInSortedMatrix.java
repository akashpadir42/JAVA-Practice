public class SearchInSortedMatrix {
    public static boolean searchTOPRIGHT(int matrix[][], int key){
        int row=0, col= matrix.length-1;
        while (row< matrix.length && col>=0){
            if (key==matrix[row][col]){
                System.out.println("Key found at cell ("+ row + ","+ col +")");
                return true;
            } else if (key<matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static boolean searchBOTTOMLEFT(int matrix[][], int key){
        int row= matrix.length-1;
        int col= 0;

        while(row>=0 && col<=matrix[0].length){
            if (key==matrix[row][col]){
                System.out.println("Key found at("+ row + ","+ col+")");
                return true;
            } else if (key<matrix[row][col]) {
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Key Not Found..");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]= {{10,20,30,40}, {15,25,35,45}, {27,29,37,48}, {32,33,39,50}};
        searchBOTTOMLEFT(matrix,20);
    }
}
