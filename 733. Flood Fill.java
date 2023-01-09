class Solution {
    public void flood(int[][] image, int sr, int sc, int color,int start) {
        if(sr>=0 && sc>=0 && sr<image.length && sc<image[0].length && image[sr][sc]==start && image[sr][sc]!=color)
        {
           image[sr][sc]=color;
            flood(image,sr+1,sc,color,start);
            flood(image,sr-1,sc,color,start);
            flood(image,sr,sc-1,color,start);
            flood(image,sr,sc+1,color,start);
        }
        else
        return ;
    }
        public int[][] floodFill(int[][] image, int sr, int sc, int color){
         
         int start=image[sr][sc];
         flood(image,sr,sc,color,start);
         return image;
        }
    
}
