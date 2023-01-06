class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int a[]=new int[nums.length];
        int k=0;
        for(int i=0,j=n;i<n&&j<nums.length;i++,j++)
        {
            a[k]=nums[i];
            k++;
            a[k]=nums[j];
            k++;
        }

        return a;
        
    }
}
