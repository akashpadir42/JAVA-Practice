public class Subarray {
    public static void sub_array(int numbers[]){
        int total_subarray=0;
        for (int i=0; i< numbers.length; i++){ //start/first
            for (int j=i; j< numbers.length; j++){ //end/last
                for (int k=i; k<j; k++){
                    System.out.print(numbers[k]+ " ");
                    total_subarray++;
                }
                System.out.println();
            }
        }
        System.out.print("Total No. Of Subarrays: "+total_subarray);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        sub_array(numbers);
    }
}
