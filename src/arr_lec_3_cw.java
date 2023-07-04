public class arr_lec_3_cw {

    static int targetSum(int[] arr, int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == target) {
                    ans++;
                }
            }
        }
        return ans;
    }

    static int targetSumTriplet(int[] arr, int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if ((arr[i] + arr[j] + arr[k]) == target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    static int unique(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i]==arr[j]) {
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for (int i=0; i<n; i++){
            if (arr[i]!=-1){
                return arr[i];
            }
        }
        return -1;
    }

    static int findMax(int arr[]){
        int n= arr.length;
        int max= Integer.MIN_VALUE;
        for (int i=0; i<n;i++ ){
            if (arr[i] > max){
                max=arr[i];
            }
        }
        return max;
    }

    static int findSecondMax(int arr[]){
        int max= findMax(arr);
        for (int i=0; i< arr.length; i++){
            if (arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax= findMax(arr);
        return secondMax;
    }

    static int firstRepeat(int arr[]){
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i]==arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    static int lastRepeat(int arr[]){
        int ans=-1;
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i]==arr[j]) {
                    ans= arr[i];
                }
            }
        }
        return ans;
    }

    static int findMin(int [] arr){
        int min= Integer.MAX_VALUE;
        for (int i=0; i< arr.length; i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    static int findSecondMin(int [] arr){
        int min= findMin(arr);
        for (int i=0; i< arr.length; i++){
            if (arr[i]==min){
                arr[i]=Integer.MAX_VALUE;
            }
        }
        int secondmin= findMin(arr);
        return secondmin;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,5,3,4,6};
        int target = 12;
//        System.out.println(targetSum(arr,target));
//        System.out.println(targetSumTriplet(arr,target));
//        System.out.println(unique(arr));f
//        System.out.println(findSecondMax(arr));
//        System.out.println(lastRepeat(arr));
//        System.out.println(findMin(arr));
        System.out.println(findSecondMin(arr));
    }
}



