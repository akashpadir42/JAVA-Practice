import java.util.jar.JarOutputStream;

public class TwoPointers_Array {

    static void sortArray(int arr[],int count){
        for (int i=0; i< arr.length;i++){
            if (i<count){
                arr[i]=0;
            }
            else {
                arr[i]=1;
            }
        }
    }
    static void swap(int arr[], int left, int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    static void sortZeroesAndOnes(int arr[]){
        int n= arr.length;
        int left= 0;
        int right= n-1;
        while (left<right){
            if (arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
            }
            if (arr[left]==0) {
                left++;
            }
            if (arr[right]==1) {
                right--;
            }
        }
    }

    static void sortEvenOdd(int arr[]){
        int n= arr.length;
        int left= 0;
        int right= n-1;
        while (left<right){
            if (arr[left]%2!=0 && arr[right]%2==0){
                swap(arr,left,right);
            }
            if (arr[left]%2==0) {
                left++;
            }
            if (arr[right]%2!=0) {
                right--;
            }
        }
    }

    static void printArray(int arr[]){
        int n= arr.length;
        for (int i=0; i< n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void reverseInPlace(int [] arr) {
        int n = arr.length, i = 0, j = n - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    static int [] NonDecreArr(int arr[]) {
        int n = arr.length;
        int left = 0,right = n - 1;;
        int ans[]= new int[n];

        int k=n-1;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k--]=arr[left]*arr[left];
                left++;
            } else{
                ans[k--]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void main(String [] args) {
        int arr[]= {-10,-3,-2,1,4,5};
        System.out.println("Original array");
        printArray(arr);
        /*
        int count=0;
        for (int i=0; i< arr.length; i++){
            if (arr[i]==0){
                count++;
            }
        }
        sortArray(arr,count);
        printArray(arr);
        */
//        sortEvenOdd(arr);
        int [] ans= NonDecreArr(arr);
        System.out.println();
        System.out.println("Array After Sorting");
//        reverseInPlace(ans);
        printArray(ans);



    }
}
