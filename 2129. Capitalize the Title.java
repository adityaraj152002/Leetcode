class Solution {
    public String capitalizeTitle(String title) {

        title=title.toLowerCase();

        String[] str=title.split(" ");

        String s="";
        
        for(int i=0;i<str.length;i++)
        {
            if(str[i].length()>2)
            {
                StringBuilder title1 = new StringBuilder(str[i]);
                char c=Character.toUpperCase(title1.charAt(0));
                title1.setCharAt(0, c);
                if(i==str.length-1)
                s=s+title1.toString();
                else
                s=s+title1.toString()+" ";

            }
            else{
                if(i==str.length-1)
                s=s+str[i];
                else
                s=s+str[i]+" ";
            }

        }

       return s;
    }
}
