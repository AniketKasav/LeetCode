class Solution {
    public int distinctSubseqII(String s) {
        final long MOD = 1_000_000_007;
        int n=s.length();
        int last[]=new int[26];
        Arrays.fill(last,-1);
        long memo[]=new long[n+1];
        memo[0]=1;
        for(int i=1;i<=n;i++){
            char ch=s.charAt(i-1);
            if(last[ch-'a']==-1){
                memo[i]=(2*memo[i-1])%MOD;
                last[ch-'a']=i;
            }else{
                memo[i]=(2*memo[i-1]-memo[last[ch-'a']-1]+MOD)%MOD;
                last[ch-'a']=i;
            }
        }
        return (int)((memo[n]-1+MOD)%MOD);
    }
}