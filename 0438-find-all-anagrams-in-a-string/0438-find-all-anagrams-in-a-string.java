class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // List<Integer> ans=new ArrayList<>();

        // for(int i=0;i<s.length();i++){
        //     if(isAnagrams(s,p,i)){
        //         ans.add(i);
        //     }
        // }
        // return ans;
        // above solution is worst and too slow 
        // go for the sliding window and single freq array for the each window and when window update update the
        // freq array also

        List<Integer> ans=new ArrayList<>();

        int l1=s.length();
        int l2=p.length();
        if(l1<l2) return ans;
        int[] freqS=new int[26];
        int[] freqP=new int[26];

        for(int i=0;i<l2;i++){   // count the freq for the first window separately
            freqS[s.charAt(i)-'a']++;
            freqP[p.charAt(i)-'a']++;
        }

        if(Arrays.equals(freqS,freqP)){
            ans.add(0);  // first index
        }

        // and now use the sliding window for the remainig
        for(int i=l2;i<l1;i++){
            freqS[s.charAt(i-l2)-'a']--;   // remove first letter from window
            freqS[s.charAt(i)-'a']++;     // add next letter in window
            if(Arrays.equals(freqS,freqP)){
                ans.add(i-l2+1);
            }
        }

        return ans;
    }

    // public boolean isAnagrams(String s,String p,int idx){
    //     boolean ans=true;
    //     int[] freq=new int[26];
    //     for(int i=0;i<p.length();i++){
    //         freq[p.charAt(i)-'a']++;
    //         if(idx+i<s.length()){
    //         freq[s.charAt(idx+i)-'a']--;
    //         }
    //     }

    //     for(int i=0;i<26;i++){
    //         if(freq[i]!=0){
    //             ans=false;
    //             break;
    //         }
    //     }
    //     return ans;
    // }

}