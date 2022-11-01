class Solution {
    public int minimumOperations(int[] nums) {
        
        HashSet<Integer>h=new HashSet<>();
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]!=0)
                    h.add(nums[i]);
            }
        return h.size();
    }
}
