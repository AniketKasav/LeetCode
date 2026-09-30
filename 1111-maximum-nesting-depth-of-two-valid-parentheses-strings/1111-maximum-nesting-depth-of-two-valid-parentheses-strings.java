class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int count=0;
        int n=seq.length();
        int[] result=new int[n];

        for(int i=0;i<n;i++){
            char ch=seq.charAt(i);
            if(ch=='('){
                count++;
                result[i]=count%2;
            }else{
                result[i]=count%2;
                count--;
            }
        }
        return result;
    }
}