class Solution {
    public void reverseString(char[] s) {
        String a=new String(s);

        StringBuilder sb=new StringBuilder(a);
        sb.reverse();
         a=sb.toString();
         
        for(int i=0;i<s.length;i++)
        {
            s[i]=a.charAt(i);
        }
       
    }
}
