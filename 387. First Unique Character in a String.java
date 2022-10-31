class Solution {
    public int firstUniqChar(String s) {
        boolean flag=true;
        for(int i=0;i<s.length();i++)
        {
            flag=true;
            for(int j=0;j<s.length();j++)
            {
                if(i!=j&&s.charAt(i)==s.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(flag)
                return i;
        }
        return -1;
    }
}
