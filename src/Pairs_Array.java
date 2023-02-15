public class Pairs_Array {
    public static void NumPair(int numbers[]) {
        for (int i=0; i<numbers.length;i++){
            int curr= numbers[i];
            for (int j=i+1; j< numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
            }
            System.out.println();
        }
        int NoOfPairs= (numbers.length*(numbers.length-1))/2;
        System.out.print("Total No. Of Pairs= "+ NoOfPairs);

    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        NumPair(numbers);


    }
}
