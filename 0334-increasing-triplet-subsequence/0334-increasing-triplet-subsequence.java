class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i=0;
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE; 
        while(i<nums.length)
        {
            int z=nums[i];//5
            
             if (x>=z) {
                x=z;
            } else if(y>=z) {
                y = z;
            } else {
                return true;
            }
            i++;
        }
        return false;
    }
}