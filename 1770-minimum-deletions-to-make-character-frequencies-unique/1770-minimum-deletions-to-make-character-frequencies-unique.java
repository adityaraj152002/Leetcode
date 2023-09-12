class Solution {
    public int minDeletions(String s) {

        Map<Character,Integer>m=new HashMap<>();
        Set<Integer>fre=new HashSet<>();

        for(char c : s.toCharArray())
        {
            m.put(c,m.getOrDefault(c,0)+1);
        }

        int del=0;

        for(int f : m.values())
        {
            while(f>0 && fre.contains(f))
            {
                f--;
                del++;
            }
            fre.add(f);
        }

        return del;
        
    }
}