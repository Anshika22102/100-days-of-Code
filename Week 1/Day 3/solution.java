class Solution {
    public int maxProfit(int[] prices) {
        int abc = Integer.MAX_VALUE;
        int de = 0;
        int fg = 0;

        for(int i =0; i < prices.length;i++){
            if(prices[i]<abc){
                abc = prices[i];
            }
            fg = prices[i] - abc;
            if(de<fg){
                de = fg;
            }
        }
        return de;
    }
}
