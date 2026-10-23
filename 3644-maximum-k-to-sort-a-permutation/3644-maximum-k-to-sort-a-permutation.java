class Solution {
    public int sortPermutation(int[] nums) {
        int i=0;
        while(i<nums.length && nums[i]==i){
            i++;
        }
        //System.out.println("Value of i "+i);
        if(i==nums.length)return 0;
        int ans=nums[i];
        //System.out.println("ans is : "+ans);
        i++;
        while(i<nums.length){
            if(nums[i]!=i){
                ans=ans&nums[i];
                //System.out.println("ans is in if: "+ans);
            }
            i++;
        }
        //System.out.println("ans is : "+ans);
        return ans;
    }
}