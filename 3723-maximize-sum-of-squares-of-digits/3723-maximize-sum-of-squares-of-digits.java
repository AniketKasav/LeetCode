class Solution {
    public String maxSumOfSquares(int num, int sum) {

        if(sum>9*num) return "";

        StringBuilder ans=new StringBuilder();
        while(ans.length()!=num){
            int curr=Math.min(9,sum);
            sum-=curr;
            ans.append(curr);
        }
        
        return ans.toString();
    }
}