import java.util.Scanner;

public class Rec_Basics {
    public static void PrintDec(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.print(n+" ");
        PrintDec(n-1);
    }

    public static void PrintInc(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        PrintInc(n-1);
        System.out.print(n+" ");

    }

    public static int FirstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }
        return FirstOccurence(arr, key, i+1);
    }

    public static int LastOccurence(int arr[], int key, int i){
        if(i==0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return LastOccurence(arr,key,i-1);
    }

    public static void AllOccurences(int arr[], int key, int i) {
        //base case
        if (i == arr.length) {
            return;
        }
        if (arr[i]==key){
            System.out.print(i+" ");
        }
        AllOccurences(arr, key, i+1);
    }

    //sum of first n natural numbers
    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        return n + Sum(n-1);
    }


    //Tilling Problem
    public static int tillingProblem(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }

        //kaam
        //vertical choice
        int vertical= tillingProblem(n-1);

        //horizontal choice
        int horizonatl= tillingProblem(n-2);

        //total ways
        int totWays= vertical + horizonatl;
        return totWays;
    }

    //Removing duplicates from the String

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        // base case
        if (idx==str.length()){
            System.out.println(newStr);
            return ;
        }

        //kaam
        char currChar= str.charAt(idx);
        if (map[currChar-'a']==true){
            //duplicates
            removeDuplicates(str, idx +1, newStr, map);
        } else{
            map[currChar-'a']= true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static int friendsPairing(int n){
        // base case
        if(n==1 || n==2){
            return 1;
        }

        //choice
        //single
        int fnm1= friendsPairing(n-1);

        //pair
        int fnm2= friendsPairing(n-2);
        int pair_ways= (n-1) * fnm2;

        //total ways
        int total_ways= fnm1 + pair_ways;
        return total_ways;
    }

    public static void Q1(int N) {

    }

    public static void main(String[] args) {
        int arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key =2 ;
        AllOccurences(arr, key, 0);
    }
}
