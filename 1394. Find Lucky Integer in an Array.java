class Solution {
    public int findLucky(int[] arr) {

        HashSet<Integer>h=new HashSet();
        
        for(int i=0;i<arr.length;i++)
        {
            h.add(arr[i]);
        }

        ArrayList<Integer>l=new ArrayList<>(h);
           int cnt=0;
           int a[]=new int[l.size()];
           
        for(int i=0;i<l.size();i++)
        {
              cnt=0;
            for(int j=0;j<arr.length;j++)
            {
                if(l.get(i)==arr[j])
                  cnt++;
            }
            if(cnt==l.get(i))
               a[i]=cnt;
        }
        Arrays.sort(a);
        if(a[a.length-1]==0)
          return -1;
        return a[a.length-1];
    }
}
