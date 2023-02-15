public class DecToBin {

    public static void DecToBin(int n) {
        int pow=0;
        int BinNum=0;

        while (n>0){
            int remainder= n%2;
            BinNum= BinNum + (remainder* (int) Math.pow(10,pow));
            pow++;
            n/=2;
        }
        System.out.println(BinNum);
    }

    public static void main(String[] args) {
        DecToBin(8);
    }
}
