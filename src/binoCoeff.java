//Binomial Coefficient Formula
//nCr= n!/ [r!*(n-r)!]
public class binoCoeff {

    public static int factorial(int n){
        int fact=1;
        for (int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }

    public static int bC(int n, int r) {
        int n_fact= factorial(n);
        int r_fact= factorial(r);
        int nmr_fact= factorial(n-r);

        int BinoCoeff= n_fact / (r_fact*nmr_fact);

        return BinoCoeff;
    }
    public static void main(String[] args) {
        System.out.println(bC(5,2));

    }
}
