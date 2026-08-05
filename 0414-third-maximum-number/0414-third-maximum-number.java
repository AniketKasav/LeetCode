class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        if(n==2)return Math.max(nums[0],nums[1]);
        Arrays.sort(nums);
        int i=0;
        int count=0;
        for(i=n-1;i>0;i--){
            if(nums[i]!=nums[i-1]){
                count++;
            }
            if(count==2){
                return nums[i-1];
            }
        }
        return nums[n-1];
    }
}