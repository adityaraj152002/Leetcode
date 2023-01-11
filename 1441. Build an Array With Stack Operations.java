class Solution {
    public List<String> buildArray(int[] target, int n) {
        int i=0,j=0;
        List<String>l=new ArrayList<>();    // p  o  
        while(i<target[target.length-1])//2
        {
           l.add("Push");
            if(j<target.length && i+1!=target[j])//1!=2
            {
               l.add("Pop");
            }
            else
                j++;
            i++;
        }
        return l;
    }
}
