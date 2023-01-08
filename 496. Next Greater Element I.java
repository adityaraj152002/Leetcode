class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int a[]=new int[nums1.length],k[]=new int[nums1.length];
      for(int i=0;i<nums1.length;i++)
      {
          for(int b=0;b<nums2.length;b++)
          {
              if(nums1[i]==nums2[b])
                {
                     k[i]=b;
                     break;
                }
          }
          for(int j=k[i];j<nums2.length;j++)
          {
              if(nums1[i]<nums2[j])
               {
                   a[i]=nums2[j];
                   break;
               }
               else{
                   a[i]=-1;
               }
            
          }
      }
       return a;
    }
}
