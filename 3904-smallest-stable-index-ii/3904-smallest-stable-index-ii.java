class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int len=nums.length;
        if(len==1)return 0;
        int[] minArr=new int[len];
        minArr[len-1]=nums[len-1];
        for(int i=len-2;i>=0;i--){
            minArr[i]=(nums[i]<minArr[i+1])?nums[i]:minArr[i+1];
        }
        
        int max=Integer.MIN_VALUE;

        for(int i=0;i<len;i++){
            max=Math.max(nums[i],max);
            if(max-minArr[i]<=k)return i;
        }
        return -1;
    }
}