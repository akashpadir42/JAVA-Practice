import java.util.Scanner;

public class PresentQuery {

    static int[] makeFreqArray(int arr[]){
        int freq[]= new int[1000005];
        for (int i=0; i< arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter array elements:");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int freq[]=makeFreqArray(arr);
        System.out.print("Enter Number Of Queries:");
        int q= sc.nextInt();
        while(q>0){
            System.out.print("Enter the element to be searched:");
            int x= sc.nextInt();
            if (freq[x]!=0){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
            q--;
        }
    }
}
