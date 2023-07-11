class Solution {
    public int totalMoney(int n) {
        int val=0;
        int d=1;
        for(int i=0;i<n;i++)
        {
          if(i%7==0)
          {
            d=i/7+1;
          }
          val=val+d;
          d++;
        }
        return val;
    }
}
