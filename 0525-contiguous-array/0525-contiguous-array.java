class Solution {
    public int findMaxLength(int[] nums) {
       HashMap<Integer,Integer> mp=new HashMap<>();
       mp.put(0,-1);
        int maxLen=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(n==1){
                sum++;
            }else{
                sum--;
            }
            if(mp.containsKey(sum)){
                maxLen=Math.max(maxLen,i-mp.get(sum));
            }else{
                mp.put(sum,i);
            }
        }
        return maxLen;

    }
}