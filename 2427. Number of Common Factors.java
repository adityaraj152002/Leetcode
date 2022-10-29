class Solution {
    public int commonFactors(int a, int b) {
        int cnt=0;
        if(a==b){
         for(int i=1;i<=a;i++){
            if(a%i==0 )
            {
                cnt++;
            }
          }
            return cnt;
        }
        int max=(a>b)?a:b;
        for(int i=1;i<=max/2;i++)
        {
            if(a%i==0 && b%i==0)
            {
                cnt++;
            }
        }
        return cnt;
    }
}
