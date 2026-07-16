class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[]=new int[]{-1,-1};
        int l=0;
        int r=nums.length-1; 
        while(l<=r){      // for finding the initial target
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                result[0]=mid;
                r=mid-1;
            }else if(target<nums[mid]){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        l=0;
        r=nums.length-1;
        while(l<=r){      // for finding the final target
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                result[1]=mid;
                l=mid+1;
            }else if(target<nums[mid]){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return result; 
    }
}