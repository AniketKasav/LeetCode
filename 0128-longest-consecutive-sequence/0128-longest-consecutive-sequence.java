class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        int currcount=0;
        int maxcount=0;
        for(int num:set){
            
            if(!set.contains(num-1)){
                int temp=num;
                currcount=1;
                while(set.contains(temp+1)){
                    currcount++;
                    temp=temp+1;
                }
                if(currcount>maxcount)maxcount=currcount;
            }
        }
        return maxcount;
    }
}