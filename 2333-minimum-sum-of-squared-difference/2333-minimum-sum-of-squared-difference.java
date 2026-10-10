class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int[] freq=new int[100001];
        long k=(long)k1+k2;
        long sum=0;
        int max=0;
        for (int i=0;i<nums1.length;i++){
            int x=Math.abs(nums1[i]-nums2[i]);
            freq[x]++;
            sum+=x;
            max=Math.max(max,x);
        }
        if(sum<=k)return 0;

        for (int i=max;i>0 && k>0;i--){
            long move=Math.min(freq[i],k);
            freq[i]-=move;
            freq[i-1]+=move;
            k-=move;
        }

        long ans=0;
        for(int i=0;i<=max;i++){
            ans+=(long)i*i*freq[i];
        }

        return ans;

    }
}