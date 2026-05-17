class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice=Integer.MAX_VALUE;
        int maxpft=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                maxpft=Math.max(profit,maxpft);
            }else{
                buyPrice=prices[i];
            }
        }
        return maxpft;
    }
}