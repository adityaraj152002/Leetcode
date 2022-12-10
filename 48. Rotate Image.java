class Solution {
    public void rotate(int[][] matrix) {
        int a[][]=new int[matrix.length][matrix.length];
        int n=0,m=0;
        for(int i=matrix.length-1;i>=0;i--)//[1,2,3],[4,5,6],[7,8,9]
        {
            n=0;
        for(int j=0;j<matrix.length;j++)
          {
           a[n][m]=matrix[i][j];//3,0
             n++;
          }
          m++;
        }
      for(int i=0;i<matrix.length;i++)
        {
        for(int j=0;j<matrix.length;j++)
          {
              matrix[i][j]= a[i][j];
           System.out.print(a[i][j]+" ");
          }
          System.out.println();
        }
    }
}
