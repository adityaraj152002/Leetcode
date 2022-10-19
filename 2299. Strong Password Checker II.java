class Solution {
    public boolean strongPasswordCheckerII(String password) {
        boolean s=false,l=false,u=false,d=false;
        if(password.length()<8)
            return false;
        for(int i=0;i<password.length()-1;i++)
        {
            if(password.charAt(i)==password.charAt(i+1))
                return false;
            if((password.charAt(i)<'a' && password.charAt(i)>'z')||(password.charAt(i)<'A' && password.charAt(i)>'Z') || (password.charAt(i)<'a'&& password.charAt(i)>'z') || (password.charAt(i)<'0' && password.charAt(i)>'1'))
                return false;
            
        }
        for(int i=0;i<password.length();i++)
        {
            if(password.charAt(i)=='!'||password.charAt(i)=='@'||password.charAt(i)=='#'||password.charAt(i)=='$'||password.charAt(i)=='%'||password.charAt(i)=='^'||password.charAt(i)=='&'||password.charAt(i)=='*'||password.charAt(i)=='('||password.charAt(i)==')'||password.charAt(i)=='-'||password.charAt(i)=='+')
                s=true;
            if(password.charAt(i)>='A'&&password.charAt(i)<='Z')
                u=true;
             if(password.charAt(i)>='a'&&password.charAt(i)<='z')
                l=true;
             if(password.charAt(i)>='0'&&password.charAt(i)<='9')
                d=true;
        }
        if(d&&l&&s&&u)
            return true;
        return false;
    }
}
