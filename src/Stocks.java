public class Stocks {

    public static int BuySell(int prices[]) {
        int n= prices.length;
        int currMin= prices[0];
        int maxprofit=0;
        for (int i=0; i<n; i++){
            currMin= Math.min(currMin, prices[i]);
            int profit= prices[i]-currMin;
            maxprofit= Math.max(maxprofit,profit);
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[]= {7,1,5,3,6,4};
        System.out.println(BuySell(prices));

    }
}
