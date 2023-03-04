public class PracticeQ_selectionsort {
    public static void selectionsort(int arr[]){
        for (int i=0; i< arr.length; i++){
            int currPos= i;
            for (int j=i+1; j< arr.length;j++){
                if (arr[j]<arr[currPos]){
                    currPos=j;
                }
            }
            //swap
            int temp= arr[currPos];
            arr[currPos]= arr[i];
            arr[i]= temp;
        }
    }

    public static void printArr(int arr[]){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {3,6,2,1,8,7,4,5,3,1};
        selectionsort(arr);
        printArr(arr);
    }
}
