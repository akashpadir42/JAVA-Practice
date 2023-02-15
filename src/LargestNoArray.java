public class LargestNoArray {
    public static int GetLargest(int number[]){
        int largest= Integer.MIN_VALUE;
        for (int i=0; i<number.length; i++){
            if (number[i]>largest){
                largest=number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int number[]={1,3,7,5};
        System.out.print("Largest Number is "+GetLargest(number));

    }
}
