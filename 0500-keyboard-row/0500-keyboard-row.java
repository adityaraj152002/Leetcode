class Solution {
    public String[] findWords(String[] words) {

        

        String q="qwertyuiop";
        String a="asdfghjkl";
        String z="zxcvbnm";

        String Q="QWERTYUIOP";
        String A="ASDFGHJKL";
        String Z="ZXCVBNM";

      

    //    String arr[]=new String[words.length];
        List<String> arr = new ArrayList<>();

        int cnt=0;
        for(int j=0;j<words.length;j++)
        {
            int c=1;
            String s=words[j].substring(0,1);
              if(q.contains(s) || Q.contains(s))
                {
                    cnt=1;
                }
            else if(a.contains(s) || A.contains(s))
                {
                    cnt=2;
                }
                else if(z.contains(s) || Z.contains(s))
                {
                    cnt=3;
                }
            for(int i=1;i<words[j].length();i++)
            {
                 s=Character.toString(words[j].charAt(i));
                if((q.contains(s) || Q.contains(s)) && cnt==1)
                {
                    c++;
                }
            else if((a.contains(s) || A.contains(s)) && cnt==2)
                {
                    c++;
                }
                else if((z.contains(s) || Z.contains(s)) && cnt==3)
                {
                    c++;
                }
                else{
                    break;
                }

               
            }
                
            if(c==words[j].length())
            {
                arr.add(words[j]);
            }


        }

        String ans[]=new String[arr.size()];
        return arr.toArray(ans);
    }
}