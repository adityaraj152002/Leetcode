class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++)
        {
            String a=Character.toString(s.charAt(i));

        if('a'<=s.charAt(i) && 'z'>=s.charAt(i) ||  'A'<=s.charAt(i) && 'Z'>=s.charAt(i))
        {
            str=str+a;
        }
        else if('0'<=s.charAt(i) && '9' >=s.charAt(i))
        {
            str=str+a;
        }

        }
              str=str.toLowerCase();  

              StringBuilder sb=new StringBuilder(str);
              sb.reverse();
              String rev=sb.toString();

            //   System.out.println(str);
              return str.equals(rev);
    }
}