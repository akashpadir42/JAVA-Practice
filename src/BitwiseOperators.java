public class BitwiseOperators {

    public static void oddoreven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }

    public static int getithbit(int n, int i){
        int bitmask= 1<<i;

        if ((n & bitmask)==0){
            System.out.print(i + " bit is= ");
            return 0;
        }
        System.out.print(i + " bit is= ");
        return 1;
    }

    public static int setithbit(int n, int i){
        int bitmask= 1<<i;
        return n | bitmask;
    }

    public static int clearithbit(int n, int i){
        int bitmask= ~(1<<i);
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println( clearithbit(10,1));
    }
}
