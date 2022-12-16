class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int k=0;
        for (int i=1; i<nums.length; i++)
            if (nums[i] > max){
                max = nums[i];
                k=i;
                }
                Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]*2>nums[nums.length-1])
               return -1;
        }
           return k;
    }
}
