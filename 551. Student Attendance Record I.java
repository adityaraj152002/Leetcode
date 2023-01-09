class Solution {
    public boolean checkRecord(String s) {
        if(s.contains("LLL"))
          return false;
          int cnt=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A')
              cnt++;
            if(cnt==2)
            return false;
        }
        return true;
    }
}
