class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ians=0;
        int dans=0;
        int n=nums.length;
        int currans=1;
        for(int i=1;i<n;i++){
            if(nums[i-1]<nums[i]){
                currans++;
            }else{
                ians=Math.max(ians,currans);
                currans=1;
            }
        }
        ians=Math.max(ians,currans);
        currans=1;
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]){
                currans++;
            }else{
                dans=Math.max(dans,currans);
                currans=1;
            }
        }
        ians=Math.max(ians,currans);
        return Math.max(ians,dans);
    }
}