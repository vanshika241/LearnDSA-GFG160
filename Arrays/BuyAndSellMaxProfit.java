package Arrays;

public class BuyAndSellMaxProfit {
    public int maximumProfit(int prices[]) {
     int n = prices.length;
     int maxProfit = 0;
     int min = prices[0];
     for(int i=1;i<n;i++){
        int currCost = prices[i]-min; // curr profit
        maxProfit = Math.max(maxProfit, currCost); // maximum profit 
        min = Math.min(min, prices[i]); // min cost we take in past
     }
     return maxProfit;
    }
}
