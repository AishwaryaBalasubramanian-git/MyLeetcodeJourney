class Solution {
    public int maxProfit(int[] prices) {
        int miniBuy = prices[0];
        int n = prices.length;
        int maxProfit = 0;
        for(int i=0;i<n;i++){
            int profit = prices[i]-miniBuy;
            maxProfit = Math.max(maxProfit, profit);
            miniBuy = Math.min(miniBuy , prices[i]);
        }
 
        return maxProfit;
    }
}