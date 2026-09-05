class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int len=nums.length;
        if(len==1)return 0;
        int[] minArr=new int[len];
        int[] maxArr=new int[len];
        maxArr[0]=nums[0];
        minArr[len-1]=nums[len-1];
        for(int i=1;i<len;i++){
            maxArr[i]=(nums[i]>maxArr[i-1])?nums[i]:maxArr[i-1];
        }
        for(int i=len-2;i>=0;i--){
            minArr[i]=(nums[i]<minArr[i+1])?nums[i]:minArr[i+1];
        }
        for(int i=0;i<len;i++){
            if(maxArr[i]-minArr[i]<=k)return i;
        }
        return -1;
    }
}