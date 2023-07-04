import java.util.*;
public class arr_lec4_cw {
    static void swap(int a, int b){
        System.out.println("Value of a before swap: "+a);
        System.out.println("Value of b before swap: "+b);
//        int temp= a;
//        a=b;
//        b=temp;
        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of a after Swap:"+a);
        System.out.println("Value of b after Swap:"+b);
    }
    static void printArr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int[] reverseArray(int[] arr){
        int n= arr.length;
        int[] ans= new int[n];
        int j=0;
        for (int i=n-1; i>=0; i--){
            ans[j++]=arr[i];
        }
        return ans;
    }
    static void swapArrayElements(int [] arr,int i,int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverseInPlace(int [] arr){
       int n= arr.length, i=0, j=n-1;
       while(i<j){
           swapArrayElements(arr,i,j);
           i++;
           j--;
       }
    }

    static int[] rotate(int[] arr, int k){
        int n= arr.length;
        k=k%n;
        int [] ans= new int[n];
        int j=0;
        for (int i=n-k; i<n; i++){
            ans[j++]=arr[i];
        }
        for (int i=0; i<n-k; i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int a=9;
        int b=3;
//        swap(a,b);
//        int [] ans= reverseArray(arr);
        int [] ans= rotate(arr,975);
        printArr(ans);
    }
}
