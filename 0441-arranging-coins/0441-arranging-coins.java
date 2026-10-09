class Solution {
    public int arrangeCoins(int n) {
        int ans=0;
        int i=1;
        while(i<=n){
            n-=i;
            i++;
            ans++;
        }
        return ans;
    }
}