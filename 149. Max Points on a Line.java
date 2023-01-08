class Solution {
    public int maxPoints(int[][] points) {
        int ans=0;
        if(points.length<=2)
         return points.length;
        for(int i=0;i<points.length;i++)
        {
            for(int j=i+1;j<points.length;j++)
            {
                int cnt=2;
                    int x1=points[i][0], x2=points[j][0];
                    int y1=points[i][1], y2=points[j][1];
                  for(int k=j+1;k<points.length;k++)
                  {
                        int x3=points[k][0], y3=points[k][1];
                        if((y2-y1)*(x3-x1)==(y3-y1)*(x2-x1))
                          cnt++;
               
                  }
                  ans=Math.max(ans,cnt);
            }
        }
        return ans;
    }
}
