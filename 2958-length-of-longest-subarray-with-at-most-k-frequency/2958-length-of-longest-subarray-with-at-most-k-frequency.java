class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        int left=0;
        int maxlen=Integer.MIN_VALUE;
        for(int right=0;right<nums.length;right++){
            int num=nums[right];
            freq.put(num,freq.getOrDefault(num,0)+1);
            while(freq.get(num)>k){
                //freq.get(nums[left]);
                freq.put(nums[left],freq.getOrDefault(nums[left],0)-1);
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}