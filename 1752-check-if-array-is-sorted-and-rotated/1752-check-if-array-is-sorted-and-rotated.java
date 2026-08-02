class Solution {
    public boolean check(int[] nums) {
        int pos=-1;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                pos=i+1;
                break;
            }
        }
        if(pos==-1)return true;
        for(int i=0;i<n-1;i++){
            if(nums[(i+pos)%n]>nums[(i+pos+1)%n]){
                return false;
            }
        }
        return true;
        
    }
}