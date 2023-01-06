class Solution {
    public int maxIceCream(int[] costs, int coins) {
        
      Arrays.sort(costs);

        int total=0,cnt=0;
        for(int i=0;i<costs.length;i++)
        {
            total=total+costs[i];
            cnt++;
               if(total>coins)
               {
                   total=total-costs[i];
                   cnt--;
               }
        }
               return cnt;
    }
}
