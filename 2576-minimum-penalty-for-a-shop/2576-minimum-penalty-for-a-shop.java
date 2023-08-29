class Solution {
    public int bestClosingTime(String customers) {

        int ccnt=0;
        for(int i=0;i<customers.length();i++)
        {
            if(customers.charAt(i)=='Y')
                {
                    ccnt++;
                }
        }

        int min=ccnt;
        int hour=0;


        for(int i=0;i<customers.length();i++)
        {
            if(customers.charAt(i)=='Y')
                {
                    ccnt--;
                }
            else{
                    ccnt++;
                }


             if(ccnt<min)
                {
                    hour=i+1;
                    min=ccnt;
                }

        }

        
        return hour;
    }
}