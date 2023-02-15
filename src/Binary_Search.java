public class Binary_Search {

    public static int binary_search(int numbers[], int key) {
        int start=0, end=numbers.length-1;

        while (start<=end){
            int mid=(start+end)/2;

            if (key==numbers[mid]){ //Found
                return mid;
            }
            if (key>=numbers[mid]){ //right
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int numbers[]= {2,4,6,8,10,12,14,16};
        int key=2;
        System.out.println("Key found at index: "+binary_search(numbers,key));

    }
}
