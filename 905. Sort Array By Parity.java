class Solution {
    public int[] sortArrayByParity(int[] nums) {

        ArrayList<Integer>even=new ArrayList();
        ArrayList<Integer>odd=new ArrayList();


        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
             even.add(nums[i]);
            else
             odd.add(nums[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);

       int j=0,k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(j<even.size())
            {
                nums[i]=even.get(i);
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
