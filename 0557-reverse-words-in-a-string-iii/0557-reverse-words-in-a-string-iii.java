class Solution {
    public String reverseWords(String s) {
         int len=s.length(); 
        if(len==1) 
            return s;
        
        int f, l;
        char[] res = s.toCharArray(); 
        char temp;
        
        for(int i=0;i<len;i++){
            
            f=i; 
            
            while(++i<len && res[i]!=' '); 
            l=i-1; 
        
            while(f<l){
                temp=res[f];
                res[f++]=res[l];
                res[l--]=temp;
            }
        }
        
        return new String(res); 
        
    }
}