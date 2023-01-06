class Solution {
    public int[] finalPrices(int[] prices) {
        
        int a[]=new int[prices.length];

        for(int i=0;i< prices.length;i++)
        {
            a[i]=prices[i];
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[i]>=prices[j])
                {
                    a[i]=prices[i]-prices[j];
                    break;
                }
            }
        }
        return a;
    }
