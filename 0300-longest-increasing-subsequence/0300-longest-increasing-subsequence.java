class Solution {
    public int lengthOfLIS(int[] nums) {
        int memo[]=new int [nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    if(memo[j]>count)count=memo[j];
                }
            }
            memo[i]=count+1;
        }
        int max=memo[0];
        for(int i=1;i<memo.length;i++){
            if(memo[i]>max){
                max=memo[i];
            }
        }
        return max;
    }
}