class Solution {
    public List<Integer> majorityElement(int[] nums) {

        Map<Integer,Integer>m=new HashMap<>();

        for(int i : nums)
        {
            m.put(i,m.getOrDefault(i,0)+1);
        }

        List<Integer>l=new ArrayList<>();

          for(Map.Entry map:m.entrySet())
          {
                // System.out.println(map.getKey()+" "+map.getValue());  
                if((int)(map.getValue())>nums.length/3)
                   l.add((Integer)(map.getKey()));
          }


          return l;
        
    }
}