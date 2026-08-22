class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,pro=1;
        int temp=n;
        while(temp>0){
            int rem=temp%10;
            sum+=rem;
            pro=pro*rem;
            temp/=10;
        }
        return (n%(sum+pro))==0;
    }
}