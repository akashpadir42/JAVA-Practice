import java.util.Scanner;

public class RangeQuery {

    static int [] makePrefixSum(int [] arr){
        for (int i=1; i<arr.length;i++){
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }
    static void printArr(int [] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements in Array: ");
        int n= sc.nextInt();

        int [] arr= new int[n+1];
        System.out.print("Enter the elements of Array: ");
        for (int i=1; i<=n; i++){
          arr[i]= sc.nextInt();
        }

        int [] pref= makePrefixSum(arr);
        System.out.print("Enter number of queries: ");
        int q= sc.nextInt();
        while(q-->0){
            System.out.println("Enter range: ");
            int l= sc.nextInt();
            int r= sc.nextInt();

            int ans= pref[r]- pref[l-1];

            System.out.println("Sum= "+ans);
        }

    }
}
