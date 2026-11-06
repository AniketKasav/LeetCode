class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<s.length();i++){
            if(isAnagrams(s,p,i)){
                ans.add(i);
            }
        }
        return ans;
    }

    public boolean isAnagrams(String s,String p,int idx){
        boolean ans=true;
        int[] freq=new int[26];
        for(int i=0;i<p.length();i++){
            freq[p.charAt(i)-'a']++;
            if(idx+i<s.length()){
            freq[s.charAt(idx+i)-'a']--;
            }
        }

        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                ans=false;
                break;
            }
        }
        return ans;
    }

}