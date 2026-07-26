class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())return "";
        if(s.equals(t))return s;
        int[] freqTarget=new int[128];
        for(int i=0;i<t.length();i++){
            freqTarget[t.charAt(i)]++;
        }
        long tlen=t.chars().distinct().count();
        int sidx=-1;
        int j=0;
        int satisfied=0;
        int minlen=Integer.MAX_VALUE;;
        boolean freqSatisfy[]=new boolean[128];
        int[] stringFreq=new int[128];
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i);
            stringFreq[idx]++;
            if(freqTarget[idx]>0 && !freqSatisfy[idx] && stringFreq[idx]==freqTarget[idx] ){
                freqSatisfy[idx]=true;
                satisfied+=1;
            }
            
            while(satisfied==tlen){
                if((i-j+1)<minlen){
                     minlen=i-j+1;
                    sidx=j;
                }
                idx = s.charAt(j);
                stringFreq[idx]--;
                if(freqSatisfy[idx] && stringFreq[idx]<freqTarget[idx] ){
                    freqSatisfy[idx]=false;
                    satisfied-=1;
                }
                j++;
            }
           
        }
        return minlen==Integer.MAX_VALUE?"":s.substring(sidx,minlen+sidx);
    }
}