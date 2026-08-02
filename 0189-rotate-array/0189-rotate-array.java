class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        helpher(0,n-k-1,nums);
        helpher(n-k,n-1,nums);
        helpher(0,n-1,nums);
    }

    public void helpher(int l,int r,int []nums){
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
}