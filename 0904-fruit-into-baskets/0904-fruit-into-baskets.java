class Solution {
    public int totalFruit(int[] f) {
        int uniqueCount=0;
        int left=0;
        int ans=0;
        int n=f.length;
        int[] freq=new int[n];
        for(int right=0;right<n;right++){
            if(freq[f[right]]==0){
                uniqueCount++;
                }
            freq[f[right]]++;
            while(uniqueCount>2){
                freq[f[left]]--;
                if(freq[f[left]]==0)uniqueCount--;
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}