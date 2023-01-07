class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int abs=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
              {
                  abs=i-start;//-9
                 abs=Math.abs(abs);
                if(min>abs)//9>9
                  min=abs;//9
              }
        }
        return min;
    }
}
