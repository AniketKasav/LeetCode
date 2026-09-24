class Solution {
    public int smallestIndex(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(digitSum(nums[i])==i)return i;
        }
        return -1;
    }

    int digitSum(int n){
        if(n<10)return n;
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

}