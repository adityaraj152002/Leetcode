class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer>even=new ArrayList();
        ArrayList<Integer>odd=new ArrayList();

          for(int i=0;i<nums.length;i++)
          {
              if(i%2==0)
               even.add(nums[i]);
            else
               odd.add(nums[i]);
          }
          Collections.sort(even);
          Collections.sort(odd,Collections.reverseOrder());
         System.out.print(even);
         System.out.print(odd);
         
         int j=0,k=0;
         for(int i=0;i<nums.length;i++)
         {
             if(i%2==0)
              {
                  nums[i]=even.get(j);
                  j++;
              }
              else{
                  nums[i]=odd.get(k);
                  k++;
              }
         }
         return nums;

       
    }
}
