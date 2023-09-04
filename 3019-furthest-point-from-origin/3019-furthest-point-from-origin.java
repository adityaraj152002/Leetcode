class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int cnt=0,rcnt=0;
        for(int i=0;i<moves.length();i++)
        {
            char move=moves.charAt(i);

            if(move=='L' || move=='_')
            {
                cnt++;
            }
            else{
                cnt--;
            }

            if(move=='R' || move=='_')
            {
                rcnt++;
            }
            else{
                rcnt--;
            }
        }

        return Math.max(cnt,rcnt);
    }
}