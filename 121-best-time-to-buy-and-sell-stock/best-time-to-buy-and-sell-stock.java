class Solution {
    public int maxProfit(int[] prices) {
    
        int min = prices[0];     // minimum price seen so far
        int maxProfit = 0;       // maximum profit so far

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i]; // update min price if current is lower
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - min); // update profit if current is higher
            }
        }

        return maxProfit;
        
    }
    
}