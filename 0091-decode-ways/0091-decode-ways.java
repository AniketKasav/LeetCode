class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        int[] dp=new int[n+1];
        dp[n]=1;

        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch>='1' && ch<='9'){
                dp[i]+=dp[i+1];
            }
            if(i+1<n){
                if(ch=='1'){
                    dp[i]+=dp[i+2];
                }else if(ch=='2' && (s.charAt(i+1)>='0' && s.charAt(i+1)<='6')){
                    dp[i]+=dp[i+2];
                }
            }
            
        }
        return dp[0];
    }
}