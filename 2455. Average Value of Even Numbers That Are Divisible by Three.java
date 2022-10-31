class Solution {
    public int averageValue(int[] nums) {
        int sum=0,cnt=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%6==0)
            {
                sum=sum+nums[i];
                cnt++;
            }
        }
        if(cnt==0||sum==0)
            return 0;
        return sum/cnt;
    }
}
