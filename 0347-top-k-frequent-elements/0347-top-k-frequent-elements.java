class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // count freq of each number using hashmap 
        // then use the bucket sort has timecomplexity O(n) to sort the data 
        // or we can say to get the element using already sorted freq
        // and the traverse sorted arr for n to 1 and get k element and return the
        HashMap<Integer,Integer>mp=new HashMap<>();
        int n =nums.length;
        if(n==1)return nums;
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        // bucket sort
        ArrayList<Integer>[] bucket=new ArrayList[n+1];
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            if(bucket[entry.getValue()]==null){
                bucket[entry.getValue()]=new ArrayList<>();
            }
            bucket[entry.getValue()].add(entry.getKey());
        }

        int[] ans=new int[k];
        int j=0;
        for(int i=n;i>=0;i--){
            if(bucket[i]!=null){
                for(int num:bucket[i]){
                    ans[j++]=num;
                    if(j==k)break;
                }
            }
            if(j==k)break;
        }
        return ans;
    }
}