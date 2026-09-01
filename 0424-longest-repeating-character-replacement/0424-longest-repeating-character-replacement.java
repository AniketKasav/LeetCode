class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int maxFreq=0;
        int currlen=0;
        int maxlen=0;
        int left=0;
        int n=s.length();
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            freq[ch-'A']++;
            maxFreq=Math.max(maxFreq,freq[ch-'A']);
            currlen=right-left+1;
            while(currlen-maxFreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
                currlen--;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}