class Solution {
    public void moveZeroes(int[] nums) {
        int arr[]=new int[nums.length];
            arr=nums;
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(arr[i]!=0){
              nums[j++]=arr[i];
           }
        }
            for(int i=j;i<nums.length;i++)
                nums[i]=0;
        
    }
}
