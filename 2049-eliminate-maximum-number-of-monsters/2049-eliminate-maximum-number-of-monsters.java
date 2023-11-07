class Solution {
    public int eliminateMaximum(int[] dist, int[] speed)
     {
        double[] a = new double[dist.length];

        for (int i=0;i<dist.length;i++) 
        {
            a[i] = (double) dist[i] / speed[i];
        }
        
        Arrays.sort(a);
        int ans = 0;
        
        for (int i=0;i<a.length;i++)
        {
            if(a[i]<=i) 
            {
                break;
            }
            
            ans++;
        }
        
        return ans;
    }
}