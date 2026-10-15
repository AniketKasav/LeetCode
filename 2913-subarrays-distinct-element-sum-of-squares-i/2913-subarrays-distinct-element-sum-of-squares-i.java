class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans=0;
        for(int left=0;left<nums.size();left++){
            HashSet<Integer> set=new HashSet<>();
            for(int right=left;right<nums.size();right++){
                set.add(nums.get(right));
                int curr=set.size();
                ans+=(curr*curr);
            }
        }
        return ans;
    }
}