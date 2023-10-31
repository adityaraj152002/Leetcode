class Solution {
    public String reverseVowels(String s) {
        
        List<Character>list=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
                list.add(s.charAt(i));
        }
        
        StringBuffer string = new StringBuffer(s);
        char ch=' ';
        int n=list.size()-1;
        for(int i=0;i<string.length();i++)
        { if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
            ch=list.get(n--);
            string.setCharAt(i, ch);
    
        }
        }
        String a=string.toString();
        return a;
        
    }
}