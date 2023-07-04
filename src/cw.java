import java.util.Arrays;

public class cw {

    static int occurences(int [] arr, int x){
        int count=0;
        for (int i=0; i< arr.length;i++){
            if (arr[i]==x){
                count++;
            }
        }
        return count;
    }

    static int lastoccurences(int [] arr, int x){
        int count=0;
        for (int i= arr.length-1; i>0;i--){
            if (arr[i]==x){
                return i;
            }
        }
        return -1;
    }

    static int GreaterCount(int [] arr, int x){
        int count=0;
        for (int i= 0; i< arr.length;i++){
            if (arr[i]>x){
                count++;
            }
        }
        return count;
    }

    static boolean isSorted(int[] arr){
        boolean check= true;
        for (int i=1; i<arr.length; i++){
            if (arr[i]<arr[i-1]){
                check= false;
            }
        }
        return check;
    }

    static int[] smallestAndLargest(int [] arr, int k){
        Arrays.sort(arr);
        int [] result= {arr[k-1], arr[arr.length-k]};
        return result;
    }
    public static void main(String[] args) {
        int [] arr= {10,20,70,30,50,80,79,82,90,105,107};
        int x=10;
//        System.out.println(GreaterCount(arr,x));
//        System.out.println(isSorted(arr));
        int k=2;
        int result[]= smallestAndLargest(arr,k);
        System.out.println(result[0]+" "+result[result.length-1]);
    }


}
