class Solution {
    public int reverseDegree(String s) {
        int[] alpha=new int[26];
        for(int i=0;i<26;i++){
            alpha[i]=26-i;
        }
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            ans+=(alpha[ch-'a']*(i+1));
        }
        return ans;
    }
}