class Solution {
    public int sumBase(int n, int k) {
        int i=0;
        int ans=0,rem=0;
        while(n>0)//34
        {
            rem=n%k;//4
            n=(int)n/k;//5
            ans=(int)(ans+rem*Math.pow(10,i));
            i++;
        }int sum=0;
        while(ans>0)
        {
            rem=ans%10;
            sum=sum+rem;
            ans=ans/10;
        }
        return sum;
    }
}
