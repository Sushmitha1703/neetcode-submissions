class Solution {
    public int maxProfit(int[] prices) {
        int buy=0;
        int sell = buy+1;
        int profit=0;
        while(buy<sell && sell<prices.length){
            if(prices[sell]-prices[buy] < 0){
                buy=sell;
            }else{
                int maxprofit=prices[sell]-prices[buy];
                if(maxprofit>profit){
                    profit=maxprofit;
                }
            }
            sell++;
        }
        return profit;
    }
}
