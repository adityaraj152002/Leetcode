class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int diff[] = new int[nums.length];
        Set<Integer> p = new HashSet();
        Set<Integer> s = new HashSet();
        for(int i = 0; i < nums.length; i++) {
            p.clear();
            s.clear();
            for(int j = 0; j < nums.length; j++) {
                if(j <= i) {
                    if(!p.contains(nums[j])) {
                        p.add(nums[j]);
                    }
                }
                if(j > i) {
                    if(!s.contains(nums[j])) {
                        s.add(nums[j]);
                    }
                }
            }
            diff[i] = p.size() - s.size();
        }
        return diff;
    }
}