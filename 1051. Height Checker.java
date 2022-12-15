class Solution {
    public int heightChecker(int[] heights) {
        int a[]=new int[heights.length];
        for(int i=0;i<a.length;i++)
             a[i]=heights[i];
        Arrays.sort(a);
        
        int cnt=0;
        
        for(int i=0;i<a.length;i++)
        {
           // System.out.print(a[i]+" = "+heights[i]);
            if(a[i]!=heights[i])
              cnt++;
        }

        return cnt;
    }
}
