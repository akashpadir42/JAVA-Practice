public class RecursionKW {
    public static int FibNo(int n){
        //base case
        if(n==0 || n==1){
            return n;
        }
        int FiB= FibNo(n-1)+ FibNo(n-2);
        return FiB;
    }

    // Binary search with Recursion

    public static int BinSearch(int [] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        //middle
        int m= s + (e-s) /2;
        if(arr[m]==target){
           return m;
        }
        //element is in the left part
        if(target<arr[m]){
            return BinSearch(arr, target, s, m-1);
        }
        //element is in the right part
        return BinSearch(arr, target, m+1, e);
    }
    public static int Q1(int N){
        //base case
        if(N==1){
            return 1;
        }
        //work and inner function calls
        System.out.println(N);
        return Q1(N-1);
    }

    //1 to N
    public static void Q2(int N){
        if(N==1){  //base case
            System.out.println(N);
            return;
        }
        //work and inner function call
        Q2(N-1);
        System.out.println(N);
    }

    //n to 1 and 1 to n
    public static void Both(int N){
        if(N==0){
            return ;
        }
        System.out.print(N + " ");
        Both(N-1);
        System.out.print(N+ " ");
    }

    public static int Factorial(int N) {
        //base case
        if (N==1){
            return 1 ;
        }
        //work and inner function calls
       return N * Factorial(N-1);
    }

    public static int Sum(int n) {
        //base case
        if (n==0){
            return 0;
        }
        //work and inner function call
        return (n%10) + Sum(n/10);
    }

    public static void Reverse(int N) {
        // base case
        if (N<10){
            System.out.println(N);
        }else {
            // print unit place
            System.out.print(N%10);
            //other digits
            Reverse(N/10);
        }
    }


    public static void main(String[] args) {

    }


}
