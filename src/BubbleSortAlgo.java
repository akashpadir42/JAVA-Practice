import java.util.*;
public class BubbleSortAlgo {
    public static void BubbleSort(int arr[]){
        int swap=0;
        for (int turn=0; turn< arr.length-1; turn++){
            for (int j=0; j<arr.length-1-turn; j++){
                if (arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                    swap++;
                }
            }
        }
        System.out.print("No. of Swaps= "+ swap+ "\n");
    }

    public static void printArr(int arr[]){
        for (int i=0;i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {5,1,4,2,8};
        BubbleSort(arr);
        System.out.println("Sorted Array");
        printArr(arr);

    }
}
