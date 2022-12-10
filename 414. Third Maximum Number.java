class Solution {
    public int thirdMax(int[] nums) {
     //   Arrays.sort(nums);
        HashSet<Integer>l=new HashSet<Integer>();

        for(int i=0;i<nums.length;i++)
           l.add(nums[i]);

      List<Integer>h=new ArrayList<>(l);
      int a[]=new int[h.size()];
      for(int i=0;i<h.size();i++)
          a[i]=h.get(i);
      Arrays.sort(a);
        if(a.length<=2)
          return a[a.length-1];

        return a[a.length-3];
    }
}
