class Solution {
    public int findNumbers(int[] nums) {
        int t=0;
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i],cnt=0;
            while(n>0)
            {
                n=n/10;
                cnt++;
            }
            if(cnt%2==0)
              t++;

        }
        return t;
    }
}
