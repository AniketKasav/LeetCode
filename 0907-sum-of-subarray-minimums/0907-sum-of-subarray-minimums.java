class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int[] left=new int[n];
        int[] right=new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            left[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        stack.clear();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            right[i]=stack.isEmpty()?n:stack.peek();
            stack.push(i);
        }

        long ans=0;
        int mod=(int)1e9 +7;

        for(int i=0;i<n;i++){
            ans+=(long)(i-left[i])*(right[i]-i)%mod*arr[i]%mod;
            ans%=mod;
        }
        return (int)ans;
    }
}