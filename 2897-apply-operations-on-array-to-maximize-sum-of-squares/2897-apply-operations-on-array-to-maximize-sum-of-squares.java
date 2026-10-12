class Solution {
    public int maxSum(List<Integer> nums, int k) {
        long mod=1_000_000_007L;
        int[] bitCount=new int[31];

        for (int num:nums){              // this count the number of 1s bit count in all nums
            for(int i=0;i<31;i++){
                if((num & (1 << i))!=0){
                    bitCount[i]++;
                }
            }
        }

        long ans=0;
        while(k-- > 0){
            long x=0;
            for (int i=0;i<31;i++){
                if(bitCount[i]>0){
                    x=x|(1L << i);
                    bitCount[i]--;
                }
            }

            ans=(ans+(x*x)%mod)%mod;
        }
        return (int)ans;

    }
}