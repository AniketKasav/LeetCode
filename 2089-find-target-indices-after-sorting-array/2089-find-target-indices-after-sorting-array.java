class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        //Arrays.sort(nums);
        // List<Integer> ans=new ArrayList<>();
        // for (int i=0;i<nums.length;i++){
        //     if(nums[i]==target)ans.add(i);
        // }
        
        // another way
        // count the element which are less than the target and equal to target 
        // and then sort the nums after sorting the count of less number well give you the starting idx in loop
        // and count of the target equal give upto which idx you will find the target

        int lessThanTargetCount=0;
        int equalToTargetCount=0;
        for (int num:nums){
            if(num<target) lessThanTargetCount++;
            if(num==target) equalToTargetCount++;
        }
        Arrays.sort(nums);
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<equalToTargetCount;i++){
            ans.add(lessThanTargetCount+i);
        }
        return ans;
    }
}