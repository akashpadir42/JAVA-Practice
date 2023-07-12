import java.util.Scanner;

public class EqualPartitionPrefixSuffix {
    static int findArraySum(int arr[]){
        int totalsum=0;
        for (int i=0; i<arr.length; i++){
            totalsum+=arr[i];
        }
        return totalsum;
    }

    static boolean equalSumPartition(int arr[]){
        int totalsum= findArraySum(arr);
        int n= arr.length;
        int prefSum=0;
        for (int i=0; i<n; i++){
            prefSum+=arr[i];
            int suffSum= totalsum-prefSum;
            if (prefSum==suffSum){
                return true;
            }
        }
        return false;
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
        System.out.println(equalSumPartition(arr));
    }
}
