class Solution {
    public boolean find132pattern(int[] nums) {
        int n=nums.length;
        Deque<Integer>stack=new ArrayDeque<>();
        int saved=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            int curr=nums[i];
            if(curr<saved)return true;
            while(!stack.isEmpty() && stack.peek()<curr){
                saved=stack.pop();
            }
            stack.push(curr);
        }
        return false;
    }
}