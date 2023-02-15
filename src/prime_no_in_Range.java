public class prime_no_in_Range {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n == 2) {
                return true;
            }
            if (n % i == 0)
                return false;
            else
                return true;
        }
        return true;
    }
    public static void primeinrange(int range){
            for (int j=2; j<=range; j++){
                if (isPrime(j)){
                    System.out.print(j+ " ");
                }
            }
            System.out.println();
        }
    public static void main(String[] args) {
        primeinrange(100);
    }
}
