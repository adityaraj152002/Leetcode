class Solution {
    public int[] sortedSquares(int[] nums) {
//        int a[]=new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            nums[i]=(int)Math.pow(nums[i],2);
        }

         Arrays.sort(nums);
         return nums;
    }
}
