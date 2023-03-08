public class TWO_DArrQ1 {
    public static void noof7(int array[][],int key){
        int count=0;
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[0].length; j++){
                if (array[i][j]==key){
                    count++;
                }
            }
        }
        System.out.println("No.of "+ key+ " = "+ count);
    }
    public static void main(String[] args) {
        int [][] array= {{4,7,8}, {8,8,7}};
        noof7(array, 7);

    }
}
