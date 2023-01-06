class Solution {
    public int findGCD(int[] nums) {

        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];

        for(int i=max;i>0;i--)
        {
            if(max%i==0 && min%i==0)
              return i;
        }
        return 1;
    }
}
