public class PracticeSortingAlgo {

    public static void selectionsort(int arr[]){
        for (int i=0; i< arr.length; i++){
            int minPos= i;
            for (int j=i+1; j<arr.length; j++){
                if (arr[minPos]>arr[j]){
                    minPos= j;
                }
            }
            int temp= arr[minPos];
            arr[minPos]= arr[i];
            arr[i]= temp;
        }
    }

    public static void insertionsort(int arr[]){
        for (int i=1; i<arr.length; i++){
            int temp= arr[i];
            int j= i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }

    public static void bubblesort(int arr[]){
        for (int i=0; i<arr.length-1; i++){
            for (int j=i+1;j< arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,4,1,3,2,4,3,7};
        insertionsort(arr);
        printArr(arr);
    }
}
