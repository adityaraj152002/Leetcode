class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> h=new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            h.add(nums[i]);
        }

        ArrayList<Integer> l=new ArrayList<>();

        for(int i=1;i<=nums.length;i++)
        {
            if(!h.contains(i))
             l.add(i);
        }

        return l;
    }
}