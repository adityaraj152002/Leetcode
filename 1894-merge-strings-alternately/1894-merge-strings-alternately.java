class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len=word1.length()+word2.length();
        String ans="";
        int cnt=0,i=0,j=0;
        while(len>cnt)
        {
            if(word1.length()>i)
            {
                char w1=word1.charAt(i);
                ans=ans+Character.toString(w1);
                cnt++;
                i++;
            }

            if(word2.length()>j)
            {
                char w2=word2.charAt(j);
                ans=ans+Character.toString(w2);
                cnt++;
                j++;
            }
        }

        return ans;
    }
}