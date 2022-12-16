class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>a=new Stack<>();
        Stack<Character>b=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            if(!a.empty()&&s.charAt(i)=='#')
            {
                a.pop();
            }
            else if(a.empty()&&s.charAt(i)=='#')
            {
                ;
            }
            else{
                a.push(s.charAt(i));
            }
        }

        for(int i=0;i<t.length();i++)
        {
            if(!b.empty()&&t.charAt(i)=='#')
            {
                b.pop();
            }
            else if(b.empty()&&t.charAt(i)=='#')
            {
                ;
            }
            else {
                b.push(t.charAt(i));
            }
        }

 //    System.out.print(a);
   //  System.out.print(b);
          
          if(a.size()!=b.size())
            return false;
      // System.out.println("Atfer");
         while(!a.empty())
         {
             
           //  System.out.print(a.peek()+"=="+b.peek());
             if(a.peek()!=b.peek())
             return false;
             a.pop();
             b.pop();
         }

        return true;
                
    }
}
