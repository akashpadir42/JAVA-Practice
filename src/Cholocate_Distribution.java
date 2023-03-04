import java.util.*;
public class Cholocate_Distribution {
    public static int findMinDiff(int arr[], int m, int n) {
        int diff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < n - m; i++) {
            int min = arr[i];
            int max = arr[i + m - 1];
            int ans = max - min;
            if (ans < diff)
                diff = ans;
        }
        return diff;
    }
        /* Driver program to test above function */
        public static void main(String[] args)
        {
            int arr[] = { 12, 4, 7, 9, 2, 23, 25, 41, 30,
                    40, 28, 42, 30, 44, 48, 43, 50 };

            int m = 7; // Number of students

            int n = arr.length;
            System.out.println("Minimum difference is "
                    + findMinDiff(arr, n, m));
        }
    }

