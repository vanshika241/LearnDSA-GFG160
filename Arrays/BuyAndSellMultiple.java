package Arrays;

public class BuyAndSellMultiple {
    public int maximumProfit(int prices[]) {
        int n = prices.length;
        int total = 0;
        int lmin = prices[0];
        int lmax = prices[0];
        int i=1;
        while (i<n) {
            
            while (i<n && prices[i]<=lmin) {
                lmin = prices[i];
                lmax = prices[i];
                i++;
            }

            while (i<n && prices[i]>lmax) {
                lmax = prices[i];
                i++;
            }

            total += lmax - lmin;
            if(i<n){
                lmax = prices[i];
                lmin = prices[i];
            }

        }
        return total;
    }
}
