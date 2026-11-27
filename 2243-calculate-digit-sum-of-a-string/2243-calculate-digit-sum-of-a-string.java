class Solution {
    public String digitSum(String s, int k) {
        
        int c=0;
        int currsum=0;
        while(s.length()>k){
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            currsum+=ch-'0';
            c++;
            if(c==k){
                sb.append(currsum);
                currsum=0;
                c=0;
            }
        }
        if(c>0)sb.append(currsum);
        currsum=0;
        c=0;
        System.out.println(sb.toString());
        s=sb.toString();
        }
        return s;
    }
}