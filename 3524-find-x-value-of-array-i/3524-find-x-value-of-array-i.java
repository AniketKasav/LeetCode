class Solution {
    public long[] resultArray(int[] nums, int k) {
        // newRemainder=(r×(nums[i]modk))modk
        // dp store the count of all the subarray end at the curr element 
        // result store all the subarray array count upto the current element
        long[] result=new long[k];
        long[] memo=new long[k];
        int n=nums.length;
        // memo[0]=nums[0]%k;
        for(int i=0;i<n;i++){
            int x=nums[i]%k;
            long[] next=new long[k];
            next[x]++;

            for(int r=0;r<k;r++){
                int newrem=(r*x)%k;
                next[newrem]+=memo[r];
            }
            for(int r=0;r<k;r++){
                result[r]+=next[r];
            }
            memo=next;
        }
        return result;
    }
}