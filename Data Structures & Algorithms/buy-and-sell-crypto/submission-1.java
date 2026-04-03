class Solution {
    public int maxProfit(int[] prices) {
    //    int res = 0;
    //    for(int i = 0; i<prices.length-1; i++){
    //     for(int j = i+1; j<prices.length; j++){
    //         res = Math.max(prices[j] - prices[i], res);
    //     }
    //    } 
    //    return res;
    int maxp = 0, minBuy = prices[0];
    for(int sell:prices){
        maxp = Math.max(maxp,sell- minBuy);
        minBuy = Math.min(sell, minBuy);
    }

    return maxp;
    }
}
