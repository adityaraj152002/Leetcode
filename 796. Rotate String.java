class Solution {
    public boolean rotateString(String s, String goal) {
        char a[]=s.toCharArray();
        char b[]=goal.toCharArray();

       
    for (int j=0;j<a.length;j++){ 
         char temp = a[0]; 
        for (int i=0;i<a.length-1;i++)   
        {
            a[i] = a[i+1];   
        }
        a[a.length-1] = temp;  
        for (int i=0;i<a.length;i++)   
        {
           System.out.print(a[i]);  
        }
        System.out.println();  
        if(Arrays.equals(a,b))
        return true;
    }

       return false;
    }
}
