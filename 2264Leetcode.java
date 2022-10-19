class Solution {
    public String largestGoodInteger(String num) {
     List<String>list=new ArrayList<>();
        String s="";
        for(int i=0;i<num.length()-2;i++)
        {
            if(num.charAt(i)==num.charAt(i+1)&&num.charAt(i+1)==num.charAt(i+2))
            {
                s=s+num.charAt(i);
                s=s+num.charAt(i+1);
                s=s+num.charAt(i+2);
                list.add(s);
            }
            s="";
        }
        Collections.sort(list);
       // System.out.println(list.get(list.size()-1));
        if(list.size()==0)
            return s;
        s=list.get(list.size()-1);
        return s;
    }
}
