public class PracticeQ_BubbleSort {

    public static void bubblesort(int arr[]){
        int swaps=0;
        for (int i=0; i< arr.length-1; i++){ //no. of turns
            for (int j=0; j< arr.length-1-i; j++){
                if (arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    swaps++;
                }
            }
        }
        System.out.println("Swaps: "+ swaps);
    }

    public static void printArr(int arr[]){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {3,6,2,1,8,7,4,5,3,1};
        bubblesort(arr);
        printArr(arr);
    }
}
