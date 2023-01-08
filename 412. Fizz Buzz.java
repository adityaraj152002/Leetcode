class Solution {
    public List<String> fizzBuzz(int n) {
        
        ArrayList<String>l=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if((i+1)%3==0&&(i+1)%5==0)
             l.add("FizzBuzz");
            else if((i+1)%3==0)
             l.add("Fizz");
            else if((i+1)%5==0)
             l.add("Buzz");
            else{
                String s=Integer.toString(i+1);
                l.add(s);
            }
        }
        return l;
    }
}
