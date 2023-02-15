public class SmallestNoArray {

    public static int getSmallest(int numbers[]) {
        int smallest= Integer.MAX_VALUE;

        for (int i=0; i<numbers.length;i++){
            if (numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int numbers[]={7,3,5,2};
        System.out.println("Smallest Number: "+getSmallest(numbers));
    }
}
