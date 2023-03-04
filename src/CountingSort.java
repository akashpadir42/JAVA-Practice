public class CountingSort {

   public static void countsort(int arr[]){
       int largest= Integer.MIN_VALUE;
       for (int i=0; i< arr.length; i++){
           largest= Math.max(largest, arr[i]);
       }

       int count[]= new int[largest+1];
       for (int i=0; i<arr.length; i++){
           count[arr[i]]++;
       }

       int j=0;
       for (int i=0; i< count.length; i++){
           arr[j]=i;
           j++;
           count[i]--;
       }
   }

    public static void printArr(int arr[]){
        for (int j=0; j<arr.length; j++){
            System.out.print(arr[j]+ " ");
        }
    }

    public static void main (String[]args){
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countsort(arr);
//        System.out.println("Sorted Array");
        printArr(arr);
    }
}
