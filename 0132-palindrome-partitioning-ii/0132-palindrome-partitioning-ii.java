class Solution {
    public int minCut(String s) {
        int n=s.length();
        boolean dp[][]=new boolean[n][n];
        for(int i=n-1;i>=0;i--){
            for(int j=i;j<n;j++){
                if(s.charAt(i)==s.charAt(j)){
                    if(j-i<=2 || dp[i+1][j-1]){
                        dp[i][j]=true;
                    }
                }
            }
        }

        int[] mincut=new int[n];
        Arrays.fill(mincut,Integer.MAX_VALUE);
        for(int i=0;i<n;i++){
            if(dp[0][i]){
                mincut[i]=0;
            }else{
                mincut[i]=i;
                for(int j=0;j<i;j++){
                    if(dp[j+1][i]){
                        mincut[i]=Math.min(mincut[i],mincut[j]+1);
                    }
                }
            }
        }
        return mincut[n-1];

    }
}