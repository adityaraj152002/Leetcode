class Solution {
    public boolean checkValidString(String s) {
       int open=0,close=0;
        int len= s.length()-1;
        for(int i=0;i<=len;i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='*')
                open++;
            else 
                open--;
            if(s.charAt(len-i)==')' || s.charAt(len-i)=='*')
                close++;
            else
                close--;
            if(open<0||close<0)
                return false;
        }
        return true;
    }
}
