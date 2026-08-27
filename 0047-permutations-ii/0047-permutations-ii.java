class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        // check the duplicate in the loop before swapping 
        List<List<Integer>> ans=new ArrayList<>();
        //List<Integer> used=new ArrayList<>();
        return permutation(nums,0,ans);
    }
    List<List<Integer>> permutation(int[] nums,int idx,List<List<Integer>> ans){

        if(idx==nums.length-1){
            List<Integer> temp=new ArrayList<>();
            for(int ele:nums){
                temp.add(ele);
            }
            ans.add(temp);
            return ans;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=idx;i<nums.length;i++){
            if(!set.isEmpty() && set.contains(nums[i])){
                continue;
            }
            set.add(nums[i]);
           
            //swap
            int temp=nums[i];
            nums[i]=nums[idx];
            nums[idx]=temp;
            // call for the next idx
            permutation(nums,idx+1,ans);
            //backtracking reverse the swap
            int var=nums[i];
            nums[i]=nums[idx];
            nums[idx]=var;
        }
        return ans;
    }

}