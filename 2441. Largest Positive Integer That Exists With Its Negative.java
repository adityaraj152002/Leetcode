class Solution {
    public int findMaxK(int[] nums) {
        int m=-1,max=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                for(int j=0;j<nums.length;j++)
                {
                    int n=nums[j]*-1;
                    if(n==nums[i])
                        max=nums[i];
                }
            }
            if(m<max)
                m=max;
        }
        return m;
    }
}
