class Solution {
    public int hIndex(int[] citations) {
        //sort 0 1 3 5 6
        //     0 1 2 3 4
        //  length=5
        // d=len-last index
        // d>=arr of last index  cnt++
        int len=citations.length;
        int d=0,cnt=0;
        Arrays.sort(citations);//1 1 3
        for(int i=len-1;i>=0;i--)
        {
            d=len-i;
            if(d<=citations[i])
                cnt++;
        }
        return cnt;
    }
}
