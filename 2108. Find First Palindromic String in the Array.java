class Solution {
    public String firstPalindrome(String[] words) {
      
        for(int i=0;i<words.length;i++)
        {
            StringBuilder input1 = new StringBuilder(); 
            input1.append(words[i]);
            
            StringBuilder rev = new StringBuilder(input1); 
            rev.reverse();
            
            String a=rev.toString();
            String b=input1.toString();
            
        if(a.equals(b)){
                return a;
            } 
        }
        
        String r="";
        return r;
        
         
    }
}
