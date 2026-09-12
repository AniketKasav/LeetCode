class Solution {
    public void allper(int []nums,int idx,List<List<Integer>> ans){
        if(idx==nums.length){
            ArrayList<Integer>temp=new ArrayList<>();
            for(int it:nums){
                temp.add(it);
            }
            ans.add(temp);
            return;
        }
        for(int i=idx;i<nums.length;i++){
            int temp=nums[i];
            nums[i]=nums[idx];
            nums[idx]=temp;
            allper(nums,idx+1,ans);
            temp=nums[i];
            nums[i]=nums[idx];
            nums[idx]=temp;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        allper(nums,0,ans);
        return ans;
    }
}