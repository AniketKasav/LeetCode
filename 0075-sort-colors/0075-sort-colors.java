class Solution {
    public void sortColors(int[] nums) {
        // shift the 0 at the start of array and 2 at the end of array and keep 1 in middle

        int low=0,high=nums.length-1, mid=0;

        while(mid<=high){
            if(nums[mid]==0){   // then shift it to the starting
            int temp=nums[mid];
            nums[mid]=nums[low];
            nums[low]=temp;
            mid++;
            low++;
            }
            else if(nums[mid]==1){
                mid++;
            }else{
                System.out.println("mid:"+nums[mid]+" high:"+nums[high]);
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            } 
        }
    }
}