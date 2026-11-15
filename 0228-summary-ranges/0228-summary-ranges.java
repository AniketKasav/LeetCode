class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();
        int n=nums.length;
        if(n==0) return ans;
        if(n==1){
            ans.add(Integer.toString(nums[0]));
            return ans;
        }
        for(int i=0;i<n-1;i++){
            StringBuilder sb=new StringBuilder();
            sb.append(nums[i]);
            boolean flag=false;
            while(i<n-1 && nums[i]==(nums[i+1]-1)){
                i++;
                flag=true;
            }

            if(flag){
                 sb.append("->").append(nums[i]);
            }
            System.out.println(i);
            ans.add(sb.toString());
        }
    if(nums[n-2]!=nums[n-1]-1){
        ans.add(Integer.toString(nums[n-1]));
    }

        return ans;
    }
}