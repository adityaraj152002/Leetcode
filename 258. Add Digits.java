class Solution {
    public int addDigits(int num) {
        
        if(num<10)
            return num;
        int a=0,sum=0;
        while(num>0)
        {
            a=num%10;
          //  System.out.println(a);
            sum=sum+a;
            num=num/10;
        }
         //System.out.println(sum);
        return addDigits(sum);
    }
}
