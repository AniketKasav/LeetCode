class Solution {
    public int maxPalindromes(String s, int k) {
        int count=0;
        int bestend=Integer.MAX_VALUE;
        int preend=-1;
        for(int i=0;i<s.length();i++){
            int[] oddLen=palindrome(i,i,s,k);
            int[] evenLen=palindrome(i,i+1,s,k);
            if(i>bestend){
                preend=bestend;
                bestend=Integer.MAX_VALUE;
                count++;
            }
            if(oddLen!=null && oddLen[0]>preend){
                if(bestend>oddLen[1]){
                    bestend=oddLen[1];
                }
            }
            
            if(evenLen!=null && evenLen[0]>preend){
                if(bestend>evenLen[1]){
                    bestend=evenLen[1];
                }
            }
            
        }
        if(bestend!=Integer.MAX_VALUE){
            count++;
        }
        return count;
    }

    int[] palindrome(int l,int r,String s,int k){
        while((l>=0 && r<s.length()) && s.charAt(l)==s.charAt(r)){
            if(r-l+1>=k){
                return new int[]{l,r};
            }
            l--;
            r++;
        }
        return null;
    }

}