class Solution {
    public int missingMultiple(int[] nums, int k) {
        // HashSet<Integer> set=new HashSet<>();
        // for(int num:nums){
        //     if(num%k==0){
        //         set.add(num/k);
        //     }
        // }
        // int n=nums.length;
        // for(int i=1;i<=n+1;i++){
        //     if(!set.contains(i)){
        //         return i*k;
        //     }
        // }
        // return 0;
        for(int multiple=k;;multiple+=k){
            boolean found=false;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==multiple){
                    found=true;
                    break;
                }
            }
            if(!found){
            return multiple;
            }
        }
    }
}