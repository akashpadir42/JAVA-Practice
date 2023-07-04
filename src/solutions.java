import javax.swing.plaf.synth.SynthFormattedTextFieldUI;

class solutions {

    static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int arr[], int i, int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void rotate(int[] nums, int k) {
        int n= nums.length;
        k=k%n;
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);
    }
    static void printArray(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int k= 2;
        rotate(arr,k);
        printArray(arr);
    }
}