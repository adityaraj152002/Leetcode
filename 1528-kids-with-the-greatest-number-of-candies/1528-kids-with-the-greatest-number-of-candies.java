class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;

        List<Boolean> l = new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            if(max<candies[i])
              max=candies[i];
        }

        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies >= max)
             l.add(true);
            else{
                l.add(false);
            }
        }

        return l;
    }
}