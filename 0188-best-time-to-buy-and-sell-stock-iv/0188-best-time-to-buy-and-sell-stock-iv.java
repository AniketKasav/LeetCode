class Solution {
    public int maxProfit(int k, int[] prices) {
        int transactions[]=new int[k+1];
        int previousProfit[]=new int[prices.length];
        previousProfit[0]=0;
        transactions[0]=0;
        // int buy=Integer.MIN_VALUE;
        // int sell=0;
        for(int trans=1;trans<=k;trans++){
            int buy=Integer.MIN_VALUE;
            int sell=0;
            for(int i=0;i<prices.length;i++){
                int profit=previousProfit[i];
                buy=Math.max(profit-prices[i],buy);
                sell=Math.max(buy+prices[i],sell);
                previousProfit[i]=sell;
            }
            transactions[trans]= Math.max(transactions[trans-1],sell);
        }
        return transactions[k];
    }
}