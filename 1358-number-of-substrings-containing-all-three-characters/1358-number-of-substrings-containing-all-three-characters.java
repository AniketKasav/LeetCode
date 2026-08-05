class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int left=0;
        int count=0;
        int freq[]=new int[26];
        for(int right=0;right<n;right++){
            char ch =s.charAt(right);
            freq[ch-'a']++;
             while(freq['a'-'a']>0 && freq['b'-'a']>0 && freq['c'-'a']>0){
                count=count+(n-right);
                freq[s.charAt(left)-'a']--;
                left++;  
            }
        }
        return count;
    }
}