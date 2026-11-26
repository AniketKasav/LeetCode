class Solution {
    public int maxSubArray(int[] nums) {
        int msum=Integer.MIN_VALUE;
        int csum=0;
        //int left=0;
        int n=nums.length;
        for(int right=0;right<n;right++){
            
           if(csum<=0){
            csum=0;
           } 
           csum+=nums[right];
            if(csum>msum){
                msum=csum;
            }
            
        }
    return msum;

    }
}