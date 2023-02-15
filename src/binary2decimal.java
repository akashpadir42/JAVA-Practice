public class binary2decimal {

    public static void BintoDec(int BinNum) {
        int myNum=BinNum;
        int pow=0;
        int DecNum=0;

        while (BinNum>0){
            int lastdigit= BinNum%10;
            DecNum= DecNum + (lastdigit* (int) Math.pow(2,pow));
            pow++;
            BinNum/=10;
        }
        System.out.println("Decimal of ("+ myNum +")2 = ("+ DecNum +")10");
    }
    public static void main(String[] args) {
        BintoDec(1000);
    }
}
