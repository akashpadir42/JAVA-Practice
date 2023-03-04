import java.util.*;
public class PracticeQ_InsertionSort {
    public static void insertionsort(int arr[]){
        for (int i=1; i<arr.length; i++){
            int temp= arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]= temp;
        }
    }
    public static void printArr(int arr[]){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {3,6,2,1,8,7,4,5,3,1};
        insertionsort(arr);
        printArr(arr);
    }
}
