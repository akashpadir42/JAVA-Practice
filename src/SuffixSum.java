import java.util.Scanner;

public class SuffixSum {
    static int[] suffsum(int arr[]){
        int n= arr.length;
        for (int i= n-2; i>=0; i--){
            arr[i]+=arr[i+1];
        }
        return arr;
    }

    static void printArray(int arr[]){
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements in Array: ");
        int n= sc.nextInt();

        int [] arr= new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Original Array:");
        printArray(arr);
        int suffixsum[]= suffsum(arr);
        System.out.println("Suffix Sum array:");
        printArray(suffixsum);
    }
}
