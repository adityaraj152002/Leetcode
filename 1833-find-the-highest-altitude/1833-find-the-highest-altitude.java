class Solution {
    public int largestAltitude(int[] gain) {
        
        int a=0;

        int max=0;

        for(int i=0;i<gain.length;i++)
        {
            a=a+gain[i];

            if(max<a)
              max=a;

        }

        return max;
    }
}