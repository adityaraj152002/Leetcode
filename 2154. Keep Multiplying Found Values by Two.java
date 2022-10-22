class Solution {
    public int findFinalValue(int[] nums, int original) {
         int n=original;
        for(int i=0;i<nums.length;i++)
        {
         //    System.out.println("Array: "+nums[i]);
            
            if(nums[i]==n)
            {
                i=-1;
                n=n*2;
           //    System.out.println(n);
            }
        
        }
        return n;
        
    }
}
