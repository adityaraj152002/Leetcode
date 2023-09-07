class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int arr[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
        {
           boolean flag=true;
            int j=i+1;
            while(j<nums.length)
            {
               
                if(nums[i]<nums[j])
                  {
                      arr[i]=nums[j];
                      flag=false;
                      break;
                  }
                  j++;
             }

             j=0;

             while(flag && j<i)
             {
                 if(nums[i]<nums[j])
                 {
                      arr[i]=nums[j];
                      flag=false;
                      break;
                  }
                  j++;
             }

             if(flag)
              arr[i]=-1;
        }

        return arr;
    }
}