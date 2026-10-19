class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans=new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            if(nums[i]==target)ans.add(i);
        }
        // int left=0;
        // int right=nums.length-1;
        // List<Integer> ans=new ArrayList<>();
        // while(left<=right){
        //     int mid=left+(right-left)/2;
        //     if(nums[mid]==target){
        //         ans.add(mid);
        //     }else if(target>nums[mid]){
        //         left=mid+1;
        //     }else if(target<nums[mid]){
        //         right=mid-1;
        //     }
        // }
        return ans;
    }
}