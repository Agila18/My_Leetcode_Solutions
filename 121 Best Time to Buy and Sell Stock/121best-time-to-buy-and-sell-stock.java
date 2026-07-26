class Solution {
    public int maxProfit(int[] prices) {
        int minimum=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int price:prices){
            if(price<minimum){
                minimum=price;
            }
            else{
                maxprofit=Math.max(maxprofit,price-minimum);
            }
        }
        return maxprofit;
    }
}