class Solution {
    public long maxAlternatingSum(int[] nums) {
        int len=nums.length;
        int half=0;
        if(len%2==0){
             half=len/2;
        }else{
            half=len/2+1;
        }
        for(int i=0;i<len;i++){
            if(nums[i]<0){
                nums[i]=nums[i]*-1;
            }
        }
        Arrays.sort(nums);
        int l=0,r=len-1;
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
        long ans=0;
        for(int i=0;i<half;i++){
            ans+=(long)(nums[i]*nums[i]);
        }
        for(int i=half;i<len;i++){
            ans-=(long)(nums[i]*nums[i]);
        }
        return ans;
    }
}