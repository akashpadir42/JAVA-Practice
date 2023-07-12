public class PrefixSum {

    static int[] makePrefixSum1(int [] arr){
        int n= arr.length;
        int [] pref= new int[n];
        pref[0]= arr[0];
        for (int i=1; i<n; i++){
            pref[i]= pref[i-1]+arr[i];
        }
        return pref;
    }

    static int[] makePrefixSum2(int[] arr){
        for (int i=1;i< arr.length;i++){
            arr[i]= arr[i-1]+arr[i];
        }
        return arr;
    }
    static void printArr(int [] arr){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int []arr= {2,1,3,4,5};
        System.out.print("Original array: ");
        printArr(arr);
        System.out.print("Prefix Sum array: ");
        makePrefixSum2(arr);
        printArr(arr);


    }
}
