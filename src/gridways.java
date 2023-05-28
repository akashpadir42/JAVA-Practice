public class gridways {

    public static int gridWays(int i, int j, int n, int m) {
        //base case
        if (i==n-1 && j==m-1){
            return 1;
        } else if (i==n || j==m) {
            return 0;
        }
        //work
        int w1= gridWays(i+1, j, n, m);
        int w2= gridWays(i, j+1, n, m);
        return w1+w2;
    }

    static long factorial(int N)
    {
        int result = 1;
        while (N > 0) {
            result = result * N;
            N--;
        }
        return result;
    }
    public static long Gways(int i, int j, int m, int n) {
        //base case
        if (i==n-1 && j==m-1){
            return 1;
        } else if (i==n || j==m) {
            return 0;
        }

        //work
        long totalways= (factorial(n-1)+factorial(m-1)) / (factorial(n-1)*factorial(m-1));
        return totalways;
    }
    public static void main(String[] args) {
        int n=5, m=4;
        System.out.println(Gways(0,0,m, n));
    }
}
