class Solution {
    public int countSubstrings(String s) {
        int totalCount=0;
        for(int i=0;i<s.length();i++){
            int even=helpher(i,i,s);
            int odd=helpher(i,i+1,s);
            totalCount+=(even+odd);
        }
        return totalCount;
    }

    int helpher(int l,int r,String s){
        int count=0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
            count+=1;
        }
        return count;
    }

}