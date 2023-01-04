class Solution {
    public int countDigits(int num) {
        int n=num,i=0;
        while(n>0)
        {
            int rem=n%10;
            //System.out.println(rem);
            if(num%rem==0)
              i++;

              n=n/10;
        }
        return i;
    }
}
