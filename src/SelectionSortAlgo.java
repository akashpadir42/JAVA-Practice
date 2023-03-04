public class SelectionSortAlgo {

    public static void selectionsort(int arr[]){
        int n= arr.length;;
        for (int i=0; i<n-1; i++){
            int minPos= i;
            for (int j=i+1; j<n; j++){
                if (arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp= arr[minPos];
            arr[minPos]= arr[i];
            arr[i]= temp;
        }
    }
    public static void PrintArr(int arr[]){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {5,1,4,2,8};
        selectionsort(arr);
        System.out.println("Sorted Array");
        PrintArr(arr);
    }
}
