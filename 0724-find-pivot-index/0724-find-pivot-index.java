class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix=new int[nums.length] ;
        prefix[0]=nums[0];
        for (int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        } 
        int sufix=0;
        int curr=Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            sufix+=nums[i];
            if(sufix==prefix[i]){
                curr=i;
            }
            if(curr<ans){
                ans=curr;
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}