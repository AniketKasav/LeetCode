class Solution {
    public String digitSum(String s, int k) {
       // int n=s.length();
        while(s.length()>k){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i+=k){
                int r=Math.min(i+k,s.length());
                int sum=0;
                for(int j=i;j<r;j++){
                    int digit=s.charAt(j)-'0';
                    sum+=digit;
                }
                sb.append(sum);
            }
            s=sb.toString();
        }
        return s;
    }
}