class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
         int tot=0,cnt=0;
        for(int i=1;i<salary.length-1;i++)
        {
            tot=tot+salary[i];
            cnt++;
        }

        return (double)tot/cnt;
    }
}
